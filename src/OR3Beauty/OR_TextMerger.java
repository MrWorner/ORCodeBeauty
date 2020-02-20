/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OR3Beauty;

import java.util.List;

/**
 *
 * @author User
 */
public class OR_TextMerger {
    public static String MergeText(List<String> listOfLines) {
        String finalText = "";
        //boolean first = true;
        //System.err.println("STARTED!|" + _listOfLines.size() + " " + _listOfLines);
        boolean first = true;
        for (String text : listOfLines) {
            if (first) {
                finalText = text;
                first = false;
            } else {
                finalText = finalText + "\n" + text;//С НОВОЙ СТРОКИ
            }
        }
        //label.setText(finalText);
        return finalText;
    }
}
