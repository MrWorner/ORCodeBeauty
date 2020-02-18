/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;

/**
 *
 * @author User
 */
public class ORPrintLnRemover {

    public static ORPrintLnRemover singleTon;
    private JTextPane jTextPane;
    private List<String> listOfRecoveryLines;

    public ORPrintLnRemover(JTextPane _textPane) {
        jTextPane = _textPane;
        singleTon = this;
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

                //String _text = "Total lines removed: " + count  + "\n";
                String text = "";
                for (int i = 0; i < listOfRemovedLines.size(); i++) {
                    
                    if (text.length() == 0) {
                        text = listOfRemovedLines.get(i);
                    }
                    else
                    {
                        text = text + "\n" + listOfRemovedLines.get(i);
                    }
                    
                }
                text = text.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB
                new PrintLnRemovalWindow(text, count).setVisible(true);
            } else {
                //JOptionPane.showMessageDialog(null, "Total lines removed: " + count);
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
        String _finalText = ORTextMerger.MergeText(singleTon.listOfRecoveryLines);
        singleTon.listOfRecoveryLines.clear();
        singleTon.jTextPane.setText(_finalText);
    }
}
