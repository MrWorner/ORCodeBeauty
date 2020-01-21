/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import jdk.nashorn.internal.objects.NativeArray;

//$Objects $OBJS $OBJ $Interface $USER $SELOBJ $SELOBJS $RETURN $ERRMSG $BASE $ILANG $XML $Xml $Date $Check $Math $Strings $Gener $NAME $SERVER true false java
//shift + Alt + F
public class CSgta {

    private JTextPane jTextPane;

    private int needToAddTab = 0;
    private int needToAddTab_comment = 0;
    private int currentEmptyLine = 0;

    private boolean isCommentedLine_brakets = false;
    private boolean isCommentedLine_classic = false;

    public CSgta(JTextPane _textPane) {
        jTextPane = _textPane;
        jTextPane.setText("Place your c# code from GTA  here");
    }

    public void CleanCode() throws BadLocationException {

        needToAddTab = 0;
        needToAddTab_comment = 0;
        currentEmptyLine = 0;
        isCommentedLine_brakets = false;
        isCommentedLine_classic = false;

        Element _root = jTextPane.getDocument().getDefaultRootElement();
        List<String> _listOfLines = new ArrayList<>();
        int _totalLines = _root.getElementCount();
        for (int i = 0; i < _totalLines; i++) {
            Element _line = _root.getElement(i);
            int _startPos = _line.getStartOffset();
            int _endPos = _line.getEndOffset() - _line.getStartOffset() - 1;
            String _textLine = _line.getDocument().getText(_startPos, _endPos);
            _textLine = RemoveExtraCode(_textLine);
            _textLine = AddCommand(_textLine);

            _listOfLines.add(_textLine);
        }

        String _finalText = ORTextMerger.MergeText(_listOfLines);
        jTextPane.setText(_finalText);

    }

    private String AddCommand(String _textLine) {
        _textLine = "Function.Call(Hash." + _textLine + ");";
        return _textLine;
    }

    private String RemoveExtraCode(String _textLine) {

        int i = _textLine.indexOf(" ");//получаем позицию символа //
        boolean i_ALIVE = i > -1;
        if (i_ALIVE) {
            String[] arrOfStr = _textLine.split(" ");
            _textLine = arrOfStr[0];
        }
        return _textLine;
    }
}
