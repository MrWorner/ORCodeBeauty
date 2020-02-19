/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import UI.Win_PrintLnRemoval;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;
import UI.P1_CodeEditor;
import javax.swing.text.Utilities;
//import com.sun.xml.internal.ws.util.StringUtils;
//import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author User
 */
public class ORPrintLn {

    /**
     *
     */
    public static ORPrintLn instance;
    private JTextPane jTextPane;
    private List<String> listOfRecoveryLines;

    public ORPrintLn(JTextPane _textPane) {
        jTextPane = _textPane;
        instance = this;
    }

    public void CleanCode() throws BadLocationException {

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "All lines that include '$Systems.println()' will be removed from the code (except those that are commented out).", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            listOfRecoveryLines = new ArrayList<>();
            int count = 0;

            Element _root = jTextPane.getDocument().getDefaultRootElement();
            List<String> listOfLines = new ArrayList<>();
            List<String> listOfRemovedLines = new ArrayList<>();
            int totalLines = _root.getElementCount();
            for (int i = 0; i < totalLines; i++) {
                Element _line = _root.getElement(i);
                int startPos = _line.getStartOffset();
                int endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
                String textLine = _line.getDocument().getText(startPos, endPos);
                boolean removeLine = FindPrintLn(textLine);
                listOfRecoveryLines.add(textLine);
                if (!removeLine) {
                    listOfLines.add(textLine);

                } else {
                    listOfRemovedLines.add((i + 1) + ": " + textLine);
                    count++;
                }

            }

            if (count > 0) {

                String finalText = ORTextMerger.MergeText(listOfLines);
                jTextPane.setText(finalText);

                //String _text = "Total lines removed: " + countSpace  + "\n";
                String text = "";
                for (int i = 0; i < listOfRemovedLines.size(); i++) {

                    if (text.length() == 0) {
                        text = listOfRemovedLines.get(i);
                    } else {
                        text = text + "\n" + listOfRemovedLines.get(i);
                    }

                }
                text = text.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB
                new Win_PrintLnRemoval(text, count).setVisible(true);
            } else {
                //JOptionPane.showMessageDialog(null, "Total lines removed: " + countSpace);
                JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
            }
        }
    }

    private boolean FindPrintLn(String text) {
        boolean removeLine = false;
        int i = text.indexOf("//");//получаем позицию символа //
        int x_printLn = text.indexOf("$Systems.println");//получаем позицию команды #if 

        if (x_printLn > -1)//если в тексте найден println
        {
            if (x_printLn < i || i == -1) {//если не закоментирован
                removeLine = true;
            }
        }

        return removeLine;
    }

    public static void RecoverText() throws BadLocationException {
        String _finalText = ORTextMerger.MergeText(instance.listOfRecoveryLines);
        instance.listOfRecoveryLines.clear();
        instance.jTextPane.setText(_finalText);
    }

    public static void AddPrintLn(JTextPane _textPane, String text) {

        try {

            int cursorPos = _textPane.getCaretPosition();

            StyledDocument doc = _textPane.getStyledDocument();
            Element root = _textPane.getDocument().getDefaultRootElement();

            /*
            int lineNum = root.getElementIndex(cursorPos  + 1);
            Element line = root.getElement(lineNum);
            int startPos = line.getStartOffset();//ПАДАЕТ!!!!
            int endPos = line.getEndOffset() - line.getStartOffset() - 1;      
            String textLine = line.getDocument().getText(startPos, endPos);
            
            int countSpace = textLine.length() - textLine.replaceAll(" ", "").length();
            if (textLine.length() > 0 && countSpace != textLine.length()) {

                if (endPos < cursorPos) {
                    doc.insertString(cursorPos, "\nStart of text", null);
                } else {
                    doc.insertString(cursorPos, "\nStart of text\n", null);
                }
            } else {
                doc.insertString(cursorPos, "Start of text", null);
            }
             */
            doc.insertString(cursorPos, "$Systems.println(\"" + text + "\")", null);

            //-------String line = doc.getText(_textPane.getCaretPosition(), 0);
        } catch (BadLocationException ex) {
            Logger.getLogger(P1_CodeEditor.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
