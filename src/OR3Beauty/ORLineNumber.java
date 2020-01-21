//https://www.tutorialspoint.com/how-can-we-display-the-line-numbers-inside-a-jtextarea-in-java
package OR3Beauty;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Element;

public class ORLineNumber extends JFrame {

    private static JTextPane textPane;
    private static JTextArea lines;
    //private JScrollPane jsp;

    public ORLineNumber(JTextPane _textPane, JScrollPane jsp) {
        textPane = _textPane;

        //setTitle("LineNumberTextArea Test");
        lines = new JTextArea("1");
        lines.setBackground(Color.LIGHT_GRAY);
        lines.setEditable(false);
        Font font = textPane.getFont();
        float size = font.getSize();
        lines.setFont(font);

        //  Code to implement line numbers inside the JTextArea
//        _textPane.getDocument().addDocumentListener(new DocumentListener() {
//            public String getText() {
//                int caretPosition = _textPane.getDocument().getLength();
//                Element root = _textPane.getDocument().getDefaultRootElement();
//                String text = "1" + System.getProperty("line.separator");
//                for (int i = 2; i < root.getElementIndex(caretPosition) + 2; i++) {
//                    text += i + System.getProperty("line.separator");
//                }
//                return text;
//            }
//
//            @Override
//            public void changedUpdate(DocumentEvent de) {
//                //lines.setText(getText());//ЛАГАЕТ ЕСЛИ ВСТАВИТЬ ИЗ БУФЕРА ОБМЕНА КОД
//            }
//
//            @Override
//            public void insertUpdate(DocumentEvent de) {
//                //lines.setText(getText());
//            }
//
//            @Override
//            public void removeUpdate(DocumentEvent de) {
//                //lines.setText(getText());
//            }
//        });
        //jsp.getViewport().add(_textPane);
        jsp.setRowHeaderView(lines);
        //add(jsp);
        //lines.setSize(1, 1);
    }

    public void CountLines() {
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
