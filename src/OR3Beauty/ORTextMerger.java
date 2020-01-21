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
public class ORTextMerger {
    public static String MergeText(List<String> _listOfLines) {
        String _finalText = "";
        //boolean first = true;
        //System.err.println("STARTED!|" + _listOfLines.size() + " " + _listOfLines);

        int i = 0;
        boolean first = true;
        for (String _text : _listOfLines) {
            if (first) {
                _finalText = _text;
                first = false;
            } else {
                _finalText = _finalText + "\n" + _text;//С НОВОЙ СТРОКИ
            }
        }
        //label.setText(finalText);
        return _finalText;
    }
}
