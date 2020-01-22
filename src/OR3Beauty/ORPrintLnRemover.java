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
import javax.swing.text.Document;
import javax.swing.text.Element;

/**
 *
 * @author User
 */
public class ORPrintLnRemover {

    public static ORPrintLnRemover singleTon;
    private JTextPane jTextPane;

    private int needToAddTab = 0;
    private int currentEmptyLine = 0;
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
            needToAddTab = 0;
            currentEmptyLine = 0;
            int count = 0;

            Element _root = jTextPane.getDocument().getDefaultRootElement();
            List<String> _listOfLines = new ArrayList<>();
            List<String> _listOfRemovedLines = new ArrayList<>();
            int _totalLines = _root.getElementCount();
            for (int i = 0; i < _totalLines; i++) {
                Element _line = _root.getElement(i);
                int _startPos = _line.getStartOffset();
                int _endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
                String _textLine = _line.getDocument().getText(_startPos, _endPos);
                boolean _removeLine = FindPrintLn(_textLine);
                listOfRecoveryLines.add(_textLine);
                if (!_removeLine) {
                    _listOfLines.add(_textLine);

                } else {
                    _listOfRemovedLines.add((i + 1) + ": " + _textLine);
                    count++;
                }

            }

            if (count > 0) {

                String _finalText = ORTextMerger.MergeText(_listOfLines);
                jTextPane.setText(_finalText);

                //String _text = "Total lines removed: " + count  + "\n";
                String _text = "";
                for (int i = 0; i < _listOfRemovedLines.size(); i++) {
                    
                    if (_text.length() == 0) {
                        _text = _listOfRemovedLines.get(i);
                    }
                    else
                    {
                        _text = _text + "\n" + _listOfRemovedLines.get(i);
                    }
                    
                }
                _text = _text.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB
                new PrintLnRemovalWindow(_text, count).setVisible(true);
            } else {
                //JOptionPane.showMessageDialog(null, "Total lines removed: " + count);
                JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
            }
        }
    }

    private boolean FindPrintLn(String _text) {
        boolean _removeLine = false;
        int i = _text.indexOf("//");//получаем позицию символа //
        int x_printLn = _text.indexOf("$Systems.println");//получаем позицию команды #if 

        if (x_printLn > -1)//если в тексте найден println
        {
            if (x_printLn < i || i == -1) {//если не закоментирован
                _removeLine = true;
            }
        }

        return _removeLine;
    }

    public static void RecoverText() throws BadLocationException {  
        String _finalText = ORTextMerger.MergeText(singleTon.listOfRecoveryLines);
        singleTon.listOfRecoveryLines.clear();
        singleTon.jTextPane.setText(_finalText);
    }
}
