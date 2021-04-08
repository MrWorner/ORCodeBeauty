//Создано по следующим находкам:
//https://www.tutorialspoint.com/how-can-we-display-the-line-numbers-inside-a-jtextarea-in-java
package OR3Beauty;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.Element;

/**
 * 
 * @author MaximGodyna
 */

public class OR_LineNumber extends JFrame {

    private static JTextPane textPane;
    private static JTextArea lines;
    private static OR_LineNumber instance;
    //private JScrollPane jsp;

    /**
     * Получить сиглтон
     * @return 
     */
    public static OR_LineNumber GetInstance(){
        return instance;
    }
    
    /**
     * Установка компонентов для подсчета строк
     * @param _textPane
     * @param jsp 
     */
    public OR_LineNumber(JTextPane _textPane, JScrollPane jsp) {
        instance = this;
        textPane = _textPane;
        lines = new JTextArea("1");
        lines.setBackground(Color.LIGHT_GRAY);
        lines.setEditable(false);
        Font font = textPane.getFont();
        lines.setFont(font);
        jsp.setRowHeaderView(lines);
    }

    /**
     * Подсчет строк
     */
    public void Refresh() {
        if (textPane != null) {
            int caretPosition = textPane.getDocument().getLength();
            Element root = textPane.getDocument().getDefaultRootElement();
            String text = "1" + System.getProperty("line.separator");
            for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
                text += i + System.getProperty("line.separator");
            }
            lines.setText(text);
        }
    }

}
