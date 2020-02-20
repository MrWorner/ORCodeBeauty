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

//import com.sun.xml.internal.ws.util.StringUtils;
//import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author User
 */
public class OR_PrintLn {

    public static OR_PrintLn instance;

    //public Map<String, String> map = new HashMap<String, String>();
    List<Integer> lineNumbers = new ArrayList<Integer>();
    List<String> linePrintLns = new ArrayList<String>();

    private JTextPane jTextPane;
    private List<String> listOfRecoveryLines;

    /**
     * Конструктор
     *
     * @param _textPane
     */
    public OR_PrintLn(JTextPane _textPane) {
        jTextPane = _textPane;
        instance = this;
    }

    public void CleanCodeNEW() throws BadLocationException {

        Element _root = jTextPane.getDocument().getDefaultRootElement();
        int totalLines = _root.getElementCount();
       
        
//        boolean isAnyPrintLnExistsInText = isAnyPrintLnExistsInText(_root, totalLines);
//        //ЕСЛИ НЕ ТЕКСТ НЕ СОДЕРЖИТЬ КОМАНДУ, ТО ПРЕДУПРЕДИТЬ
//        if (!isAnyPrintLnExistsInText) {
//            JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
//            return;
//        }

        for (int i = 0; i < totalLines; i++) {
            Element _line = _root.getElement(i);
            int startPos = _line.getStartOffset();
            int endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
            String textLine = _line.getDocument().getText(startPos, endPos);

            if (isPrintLn(textLine)) {
                lineNumbers.add(i);
                textLine = FormatLine(textLine);
                linePrintLns.add(textLine);
            }

        }
        
        if (linePrintLns.size() > 0) {
            new Win_PrintLnRemoval().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
        }
        

    }

    private String FormatLine(String textLine) {

        textLine = textLine.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB 
        textLine = textLine.replaceAll(" ", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ ПРОБЕЛА         
        return textLine;
    }

//    private boolean isAnyPrintLnExistsInText(Element _root, int totalLines) throws BadLocationException {
//        for (int i = 0; i < totalLines; i++) {
//            Element _line = _root.getElement(i);
//            int startPos = _line.getStartOffset();
//            int endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
//            String textLine = _line.getDocument().getText(startPos, endPos);
//            boolean isFound = isPrintLn(textLine);
//            if (isFound) {
//                return true;
//            }
//        }
//        return false;
//    }

//    public void CleanCode() throws BadLocationException {
//
//        int dialogButton = JOptionPane.YES_NO_OPTION;
//        int dialogResult = JOptionPane.showConfirmDialog(null, "All lines that include '$Systems.println()' will be removed from the code (except those that are commented out).", "Warning", dialogButton);
//        if (dialogResult == JOptionPane.YES_OPTION) {
//            listOfRecoveryLines = new ArrayList<>();
//            int count = 0;
//
//            Element _root = jTextPane.getDocument().getDefaultRootElement();
//            List<String> FinalListOfLines = new ArrayList<>();
//            List<String> listOfRemovedLines = new ArrayList<>();
//            int totalLines = _root.getElementCount();
//            for (int i = 0; i < totalLines; i++) {
//                Element _line = _root.getElement(i);
//                int startPos = _line.getStartOffset();
//                int endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
//                String textLine = _line.getDocument().getText(startPos, endPos);
//                boolean removeLine = isPrintLn(textLine);
//                listOfRecoveryLines.add(textLine);
//                if (!removeLine) {
//                    FinalListOfLines.add(textLine);
//
//                } else {
//                    listOfRemovedLines.add((i + 1) + ": " + textLine);
//                    count++;
//                }
//
//            }
//
//            if (count > 0) {
//
//                String finalText = OR_TextMerger.MergeText(FinalListOfLines);
//                jTextPane.setText(finalText);
//
//                //String _text = "Total lines removed: " + countSpace  + "\n";
//                String text = "";
//                for (int i = 0; i < listOfRemovedLines.size(); i++) {
//
//                    if (text.length() == 0) {
//                        text = listOfRemovedLines.get(i);
//                    } else {
//                        text = text + "\n" + listOfRemovedLines.get(i);
//                    }
//
//                }
//                text = text.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB
//                new Win_PrintLnRemoval(text, count).setVisible(true);
//            } else {
//                //JOptionPane.showMessageDialog(null, "Total lines removed: " + countSpace);
//                JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
//            }
//        }
//    }

    private boolean isPrintLn(String text) {
        boolean result = false;
        int i = text.indexOf("//");//получаем позицию символа //
        int x_printLn = text.indexOf("$Systems.println");//получаем позицию команды #if 

        if (x_printLn > -1)//если в тексте найден println
        {
            if (x_printLn < i || i == -1) {//если не закоментирован
                result = true;
            }
        }

        return result;
    }

//    public static void RecoverText() throws BadLocationException {
//        String _finalText = OR_TextMerger.MergeText(instance.listOfRecoveryLines);
//        instance.listOfRecoveryLines.clear();
//        instance.jTextPane.setText(_finalText);
//    }

    //---- ДОБАВИТЬ $Systems.println в строку на позиции курсора 
    public static void AddPrintLn(JTextPane _textPane, String text) {
        try {

            int cursorPos = _textPane.getCaretPosition();// получаем позицию курсора
            StyledDocument doc = _textPane.getStyledDocument();
            doc.insertString(cursorPos, "$Systems.println(\"" + text + "\")", null);// вставляем команду в строку

            //-------String line = doc.getText(_textPane.getCaretPosition(), 0);
        } catch (BadLocationException ex) {
            Logger.getLogger(P1_CodeEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
