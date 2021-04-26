/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package updateChecker;

import UI.P1_CodeEditor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.Global;

/**
 *
 * @author Max
 */
public class UpdateChecker {

    public static void Start() {
        new Thread(new Runnable() {
            public void run() {
                UpdateChecker.checkUpdates();
            }
        }).start();

    }

    private static void checkUpdates() {
        try {
            URL oracle;
            oracle = new URL(Global.updateCheckURL);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(oracle.openStream()));

            String inputLine;
            String foundVersion = "";
            String textMessage = "";
            //List<String> linesFromUrlFile = new ArrayList<String>();

            while ((inputLine = in.readLine()) != null) {
                //if ((inputLine = in.readLine()) != null) {
                //System.out.println(inputLine);

                if (inputLine.contains("currentVersion=")) {
                    foundVersion = inputLine;
                } else {
                    textMessage = inputLine;
                }
            }
            in.close();

            if (!foundVersion.equals(Global.version)) {
                JOptionPane.showMessageDialog(null, textMessage);
            }

        } catch (MalformedURLException ex) {
            Logger.getLogger(P1_CodeEditor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(P1_CodeEditor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
