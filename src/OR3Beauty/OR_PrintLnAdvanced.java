/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;

/**
 *
 * @author MaximGodyna
 */
public class OR_PrintLnAdvanced {

    private boolean commentLine = false;//данная строка является строкой комментарий
    private List<Integer> CommandBlocklinesNum = new ArrayList<>();

    public void Start(JTextPane textPane) throws BadLocationException {

        CommandBlocklinesNum = new ArrayList<>();
        boolean isCommentedLine_brakets = false;// является ли текущая строка комментарием в /*   */
        boolean isCommentedLine_classic = false;// является ли текущая строка комментарием //

        //--Вытаскиваем весь текст с компонента JTextPane
        Element root = textPane.getDocument().getDefaultRootElement();

        int currentCaretPos = textPane.getCaretPosition();
        int totalLines = root.getElementCount();// Подсчитываем кол-во строк МОЖНО БЫЛО ПРОСТО: FinalListOfLines.size()
        //--Проходим по каждой строке через разные методы
        for (int i = 0; i < totalLines; i++) {
            Element line = root.getElement(i);
            int startPos = line.getStartOffset();
            int endPos = line.getEndOffset() - line.getStartOffset();
            String textLine = line.getDocument().getText(startPos, endPos);

            boolean isCommentedLine = isCommentedLine(textLine);// 

            if (!isCommentedLine) {
                if (IsCommandBlock(textLine)) {
                    //System.out.println("IsCommandBlock= "  + " i= " + (i+1) +  " stroka= " + textLine);
                    CommandBlocklinesNum.add(i);
                }
            }

        }

        if (CommandBlocklinesNum.size() > 0) {

            StyledDocument doc = textPane.getStyledDocument();

            Collections.reverse(CommandBlocklinesNum);

            for (int i : CommandBlocklinesNum) {

                Element line = root.getElement(i);
                int startPos = line.getStartOffset();
                int endPos = line.getEndOffset() - line.getStartOffset();
                String textLine = line.getDocument().getText(startPos, endPos);

                if (CommandBlocklinesNum.contains(i)) {

                    //System.out.println("i= " + i + " CONTAINS!!!!!!");
                    doc.insertString(line.getEndOffset() - 1, "\n$Systems.println(\"DEBUG_Posle_" + i + "\")", null);

                    doc.insertString(startPos, "$Systems.println(\"DEBUG_Do_" + i + "\")\n", null);
                }
            }

        }

        textPane.setCaretPosition(currentCaretPos);
    }

    private String CutComentedLine(String text) {

        int i = text.indexOf("//");// получаем позицию символа //
        boolean i_EXISTS = i > -1;

        //BEGIN ВЫРЕЗАЕМ КОММЕНТАРИИ, ЧТОБЫ ИЗБАВИТЬСЯ ОТ ПРОВЕРОК       
        if (i_EXISTS) {
            String[] arrOfStr = text.split("//");
            if (arrOfStr.length != 0) {
                text = arrOfStr[0];
            }
        }
        return text;
    }

    private boolean isCommentedLine(String text) {

        text = CutComentedLine(text);//ВЫРЕЗАЕМ КОММЕНТАРИИ

        if (text.length() == 0) {
            return true;
        }

        int i_begin = text.indexOf("/*");// получаем позицию символа {*
        int i_end = text.indexOf("*/");// получаем позицию символа {*
        boolean i_begin_EXISTS = i_begin > -1;
        boolean i_end_EXISTS = i_end > -1;

        if (i_begin_EXISTS) {
            commentLine = true;
            return true;
        } else {
            if (i_end_EXISTS) {
                commentLine = false;
                return true;
            } else {
                return commentLine;
            }
        }
    }

    private boolean isAlreadyHasPrintLn(String text) {

        text = CutComentedLine(text);//ВЫРЕЗАЕМ КОММЕНТАРИИ
        boolean result = false;
        int index = text.indexOf("$Systems.println");//получаем позицию команды #if 

        if (index > -1)//если в тексте найден println
        {
            result = true;
        }

        return result;
    }

    private boolean IsCommandBlock(String text) {

        text = CutComentedLine(text);//ВЫРЕЗАЕМ КОММЕНТАРИИ        
        int x_if = text.indexOf("#if");// получаем позицию команды #if
        int x_while = text.indexOf("#while");// получаем позицию команды #while        
        int x_foreach = text.indexOf("#foreach");// получаем позицию команды #foreach
        int x_else = text.indexOf("#else");// получаем позицию команды #foreach       
        int x_end = text.indexOf("#end");//2 4.01.2020 NEW получаем позицию команды #end |  кто то помжет писать код в одну строку: #if($isZayv && $isZayv == 1) #set($personZayv = $zapFace) #end

        boolean result = false;
        //System.out.println("text = " + text + " x_if = " + x_if);

        List<Integer> listOfResults = Arrays.asList(x_if, x_while, x_foreach, x_else, x_end);

        return listOfResults.stream().anyMatch((i) -> (i > -1));
    }

}
