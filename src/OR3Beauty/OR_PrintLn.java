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
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Element;
import javax.swing.text.StyledDocument;
import UI.P1_CodeEditor;
import UI.Win_PrintLnRemoval;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

//import com.sun.xml.internal.ws.util.StringUtils;
//import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author User
 */
public class OR_PrintLn {

    public static OR_PrintLn instance;

    //public Map<String, String> map = new HashMap<String, String>();
    public static List<Integer> lineNumbers = new ArrayList<Integer>();
    public static List<String> linePrintLns = new ArrayList<String>();

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

    private void ResetLists() {
        lineNumbers = new ArrayList<Integer>();
        linePrintLns = new ArrayList<String>();
    }

    public void CleanCode() throws BadLocationException {

        ResetLists();

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
                linePrintLns.add("[" + (i + 1) + "]:      " + textLine);
            }

        }

        if (linePrintLns.size() > 0) {
            new Win_PrintLnRemoval().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Current code does not include any '$Systems.println()' command.");
        }

    }

    private String FormatLine(String textLine) {

        textLine = textLine.replaceAll("\t", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ TAB 
        textLine = textLine.replaceAll(" ", "");//УДАЛЯЕМ ВСЕ СИМВОЛЫ ПРОБЕЛА         
        return textLine;
    }

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

    /**
     * ЗАПОЛНИТЬ ТАБЛИЦУ ДАННЫМИ ИЗ ЛИСТА
     * @param table 
     */
    public static void FillTable(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for (int i = 0; i < linePrintLns.size(); i++) {

            model.addRow(new Object[]{true, linePrintLns.get(i)});
        }

    }

}
