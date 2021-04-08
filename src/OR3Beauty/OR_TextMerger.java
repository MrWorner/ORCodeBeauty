package OR3Beauty;

import java.util.List;

/**
 * 
 * @author MaximGodyna
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
