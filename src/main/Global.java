/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import UI.P2_Settings;
import java.util.ArrayList;
import javax.swing.JLabel;

public class Global {

    public static String Design = "src/Images/Backgrounds/2.jpg";
    public static String DesignName = "Orange lines";

    public static JLabel backlabelNEW;
    public static INIfile CurrentINI = new INIfile();

    public static P2_Settings SettingsPanel;
    public static ArrayList<String> ClientMessages = new ArrayList<String>();
}
