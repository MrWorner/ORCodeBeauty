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
public class ORBeauty {

    private JTextPane jTextPane;

    private int needToAddTab = 0;
    private int needToAddTab_comment = 0;
    private int currentEmptyLine = 0;

    private boolean isCommentedLine_brakets = false;
    private boolean isCommentedLine_classic = false;

    public ORBeauty(JTextPane _textPane) {
        jTextPane = _textPane;
        jTextPane.setText("Place your OR3 code here");
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
            _textLine = RemoveTabs(_textLine);
            _textLine = RemoveSpaceBeforeAny(_textLine);
            boolean _removeLine = RemoveExtraEmptyLines(_textLine);
            if (!_removeLine) {                              
                _textLine = AddRightTabs(_textLine);
                _listOfLines.add(_textLine);
            }

        }

        String _finalText = ORTextMerger.MergeText(_listOfLines);
        jTextPane.setText(_finalText);
        if (needToAddTab > 0) {
            JOptionPane.showMessageDialog(null, "Ooops. Missing #end tag(s): " + needToAddTab);
        }
    }

    private String RemoveTabs(String _text) {
        _text = _text.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB
        return _text;
    }

    private String RemoveSpaceBeforeAny(String _text) {

        //_text = _text.replaceAll("\n", "");//УДАЛЯЕМ ВСЕ С НОВОЙ СТРОКИ
        //_text = _text.replaceAll(" ", "");//УДАЛЯЕМ ВСЕ ПРОБЕЛЫ
        String finalText = "";
        boolean removedFirstSpaces = false;
        for (char ch : _text.toCharArray()) {
            if (ch != ' ' || removedFirstSpaces) {
                removedFirstSpaces = true;
                finalText = finalText + ch;
            }
        }
        //

        return finalText;
    }

    private String AddRightTabs(String _text) {

        int i = _text.indexOf("//");//получаем позицию символа //
        boolean i_ALIVE = i > -1;

        //BEGIN ВЫРЕЗАЕМ КОММЕНТАРИИ, ЧТОБЫ ИЗБАВИТЬСЯ ОТ ПРОВЕРОК
        String _cuttedText = "";
        if (i_ALIVE) {
            String[] arrOfStr = _text.split("//");
            if (arrOfStr.length != 0) {

                _text = arrOfStr[0];
                arrOfStr[0] = "//";
                boolean _first = true;
                for (String a : arrOfStr) {
                    if (a != "//") {

                        if (_first) {
                            _cuttedText = _cuttedText + a;
                            _first = false;
                        } else {
                            _cuttedText = _cuttedText + "//" + a;
                        }

                    } else {
                        _cuttedText = _cuttedText + a;
                    }

                }
            }
        }
        //END ВЫРЕЗАЕМ КОММЕНТАРИИ, ЧТОБЫ ИЗБАВИТЬСЯ ОТ ПРОВЕРОК

        //BEGIN ДЛЯ ЗАКОМЕНТИРОВАННОЙ СТРОКИ С ПОМОЩЬЮ '//'
        if (_text.length() == 0) {

            if (_cuttedText.length() > 0) { //если есть только комментарии комментарии
                //---------------System.out.println("_cuttedText = " + _cuttedText + " needToAddTab_comment = " + needToAddTab_comment);
                _text = _cuttedText;
                if (!isCommentedLine_classic) {//если режим НЕ включен, то включаем
                    isCommentedLine_classic = true;
                    isCommentedLine_brakets = true;
                }

            } else//если нет комментарии
            {
                if (isCommentedLine_classic) {//если режим включен, то отключаем
                    isCommentedLine_classic = false;
                    isCommentedLine_brakets = false;
                    needToAddTab_comment = 0;
                }
            }

        } else {
            if (isCommentedLine_classic) {//если режим включен, то отключаем
                isCommentedLine_classic = false;
                isCommentedLine_brakets = false;
                needToAddTab_comment = 0;
            }
        }
        //END ДЛЯ ЗАКОМЕНТИРОВАННОЙ СТРОКИ С ПОМОЩЬЮ '//'

        int i_begin = _text.indexOf("/*");//получаем позицию символа {*
        int i_end = _text.indexOf("*/");//получаем позицию символа {*
        boolean i_begin_ALIVE = i_begin > -1;
        boolean i_end_ALIVE = i_end > -1;

        if (i_begin_ALIVE) {
            isCommentedLine_brakets = true;
        } else {
            if (i_end_ALIVE) {
                isCommentedLine_brakets = false;
                needToAddTab_comment = needToAddTab;
            }
        }

        int x_if = _text.indexOf("#if");//получаем позицию команды #if
        int x_while = _text.indexOf("#while");//получаем позицию команды #while        
        int x_foreach = _text.indexOf("#foreach");//получаем позицию команды #foreach

        boolean x_if_ALIVE = x_if > -1;
        boolean x_while_ALIVE = x_while > -1;
        boolean x_foreach_ALIVE = x_foreach > -1;

        if (x_if_ALIVE || x_while_ALIVE || x_foreach_ALIVE) //проверяем, есть ли одна из команд, которая открывает блок
        {
            _text = OpeningBlock(_text);

        } else {//если нет команды, которая открывает блок, то проверяем - не имеется ли команда закрытия блока (#end)

            int x_end = _text.indexOf("#end");//получаем позицию команды #end
            int x_else = _text.indexOf("#else");//получаем позицию команды #else
            int x_elseif = _text.indexOf("#elseif");//получаем позицию команды #elseif

            boolean x_end_ALIVE = x_end > -1;
            boolean x_else_ALIVE = x_else > -1;
            boolean x_elseif_ALIVE = x_elseif > -1;

            if (x_end_ALIVE || x_else_ALIVE || x_elseif_ALIVE) {//если есть команда закрытие блока

                _text = ClosingBlock(_text, x_end_ALIVE);

            } else {//если нет команд открытия или закрытия блока, то просто для обычного текста

                _text = SimpleText(_text);

            }

        }

        //BEGIN ЕСЛИ БЫЛИ КОММЕНТАРИИ (//), ТО ВОЗВРАЩАЕМ В ТЕКСТ
        if (i_ALIVE) {

            if (!isCommentedLine_classic) {
                _text = _text + _cuttedText;
            }

        }
        //END ЕСЛИ БЫЛИ КОММЕНТАРИИ (//), ТО ВОЗВРАЩАЕМ В ТЕКСТ

        //System.err.println("STARTED| i = " + i + " x_foreach = " + x_foreach);
        return _text;
    }

    private String OpeningBlock(String _text) {

        for (int j = 0; j < needToAddTab; j++) {
            _text = "\t" + _text;
        }

        if (isCommentedLine_brakets) {
            for (int j = 0; j < needToAddTab_comment; j++) {
                _text = "\t" + _text;
            }

        }
        System.out.println("BEFORE OpeningBlock _text = " + _text + " needToAddTab_comment = " + needToAddTab_comment);
        if (isCommentedLine_brakets) {
            needToAddTab_comment++;
            System.out.println("OpeningBlock _text = " + _text + " needToAddTab_comment = " + needToAddTab_comment);
        } else {
            needToAddTab++;
        }

        return _text;
    }

    private String ClosingBlock(String _text, boolean isEndTag) {
        if (!isCommentedLine_brakets) {
            needToAddTab--;
        }

        for (int j = 0; j < needToAddTab; j++) {
            _text = "\t" + _text;

        }

        if (isCommentedLine_brakets) {

            if (!(needToAddTab_comment < 1)) {//Чтобы в комментарии END не выезжал из глубины  без открытого тега
                needToAddTab_comment--;
            }

            for (int j = 0; j < needToAddTab_comment; j++) {
                _text = "\t" + _text;

            }
        }

        if (!isEndTag) {//не #END
            if (!isCommentedLine_brakets) {
                needToAddTab++;//возвращаем углубление
            } else {
                needToAddTab_comment++;
            }
        }

        return _text;
    }

    private String SimpleText(String _text) {

        for (int j = 0; j < needToAddTab; j++) {
            _text = "\t" + _text;
        }
        if (isCommentedLine_brakets) {
            for (int j = 0; j < needToAddTab_comment; j++) {
                _text = "\t" + _text;
            }
        }

        return _text;
    }

    private boolean RemoveExtraEmptyLines(String _text) {
        boolean _remove = false;

        if (_text.length() == 0 || _text == " ") {
            currentEmptyLine++;
            if (currentEmptyLine > 1) {
                _remove = true;
                currentEmptyLine--;
            }
        } else {
            currentEmptyLine = 0;
        }

        return _remove;
    }
}
