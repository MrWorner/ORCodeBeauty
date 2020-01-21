/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;
import javax.swing.text.LayeredHighlighter;
import javax.swing.text.Position;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;
import javax.swing.text.View;

//$Objects $OBJS $OBJ $Interface $USER $SELOBJ $SELOBJS $RETURN $ERRMSG $BASE $ILANG $XML $Xml $Date $Check $Math $Strings $Gener $NAME $SERVER true false java
//https://stackoverflow.com/questions/19765489/jtextpane-highlighting-issue
//https://stackoverflow.com/questions/14400946/how-to-change-the-color-of-specific-words-in-a-jtextpane
public class ORHighligter {

    private int findLastNonWordChar(String text, int index) {
        while (--index >= 0) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
        }
        return index;
    }

    private int findFirstNonWordChar(String text, int index) {
        while (index < text.length()) {
            if (String.valueOf(text.charAt(index)).matches("\\W")) {
                break;
            }
            index++;
        }
        return index;
    }

    public ORHighligter(JTextPane _textPane) {

        final StyleContext cont = StyleContext.getDefaultStyleContext();
        final AttributeSet attrBlue = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLUE);
        //final AttributeSet attrGreen = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.DARK_GRAY);
        final AttributeSet attrGreen = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.red);
        final AttributeSet attrPurple = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.MAGENTA);
        final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);

        final String commandsPack_1 = "(\\W)*(#if|#end|#elseif|#else|#while|.getAttr|.after|#setAttr|#set|.createObject|#continue|#break|.equals)";
        final String commandsPack_2 = "(\\W)*($Objects|$OBJS|$OBJ|$Interface|$USER|$SELOBJ|$SELOBJS|$RETURN|$ERRMSG|$BASE|$ILANG|$XML|$Xml|$Date|$Check|$Math|$Strings|$Gener|$NAME|$SERVER|true|false|java)";
        final String commandsPack_3 = "(\\W)*($)";
        
        DefaultStyledDocument doc = new DefaultStyledDocument() {
            public void insertString(int offset, String str, AttributeSet a) throws BadLocationException {
                super.insertString(offset, str, a);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offset);
                if (before < 0) {
                    before = 0;
                }
                int after = findFirstNonWordChar(text, offset + str.length());
                int wordL = before;
                int wordR = before;
                //
                while (wordR <= after) {
                    if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                        if (text.substring(wordL, wordR).matches(commandsPack_1)) {
                            setCharacterAttributes(wordL, wordR - wordL, attrBlue, false);
                        } else if (text.substring(wordL, wordR).matches(commandsPack_2)) {
                            setCharacterAttributes(wordL, wordR - wordL, attrPurple, false);
                        } else if (text.substring(wordL, wordR).matches(commandsPack_3)) {
                            setCharacterAttributes(wordL, wordR - wordL, attrGreen, false);
                        } else {
                            setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                        }
                        wordL = wordR;
                    }
                    wordR++;
                }
            }

            public void remove(int offs, int len) throws BadLocationException {
                super.remove(offs, len);

                String text = getText(0, getLength());
                int before = findLastNonWordChar(text, offs);
                if (before < 0) {
                    before = 0;
                }
                int after = findFirstNonWordChar(text, offs);

                if (text.substring(before, after).matches(commandsPack_1)) {
                    setCharacterAttributes(before, after - before, attrBlue, false);
                } else if (text.substring(before, after).matches(commandsPack_2)) {
                    setCharacterAttributes(before, after - before, attrPurple, false);
                } else if (text.substring(before, after).matches(commandsPack_3)) {
                    setCharacterAttributes(before, after - before, attrGreen, false);

                } else {
                    setCharacterAttributes(before, after - before, attrBlack, false);
                }
            }
        };

        //jTextPane.setEditorKit(new javax.swing.text.StyledEditorKit());
        //LineNumbers lineNums = new LineNumbers( jTextPane );
        //JTextPane txt = new JTextPane(doc);
        _textPane.setStyledDocument(doc);
        //_textPane.setText("public class Hi {}");
        //add(new JScrollPane(txt));
        //setVisible(true);
    }

//    public void hightLightOld()
//            throws Exception {
//        StyledDocument doc = jTextPane.getStyledDocument();
//        SimpleAttributeSet keyWord = new SimpleAttributeSet();
//        StyleConstants.setBackground(keyWord, Color.CYAN);
//
//        String search = "Max";
//        int offset = 0;
//
//        int length = jTextPane.getDocument().getLength();
//        String text = jTextPane.getDocument().getText(0, length);
//
//        while ((offset = text.indexOf(search, offset)) != -1) {
//            doc.setCharacterAttributes(offset, search.length(), keyWord, false);
//            offset += search.length();
//        }
//    }
//    public static void removeHighlights(JTextComponent textComp) {
//        Highlighter hilite = textComp.getHighlighter();
//        Highlighter.Highlight[] hilites = hilite.getHighlights();
//
//        for (int i = 0; i < hilites.length; i++) {
//            if (hilites[i].getPainter() instanceof MyHighlightPainter) {
//                hilite.removeHighlight(hilites[i]);
//            }
//        }
//    }
//         jTextPane1.setText( jTextPane1.getText() + "+" );
//        SimpleAttributeSet keyWord = new SimpleAttributeSet();
//        StyleConstants.setForeground(keyWord, Color.RED);
//        StyleConstants.setBackground(keyWord, Color.YELLOW);
//        StyledDocument doc = jTextPane1.getStyledDocument();
//        countNum++;
//        doc.setCharacterAttributes(0, 5+countNum, keyWord, false);
}
