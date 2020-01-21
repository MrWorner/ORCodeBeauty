/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

public class Global {

    public static String ChosenStud_ID = "18";
    public static String ChosenStud_fName = "Ivan";
    public static String ChosenStud_sName = "Ivanov";
    public static String ChosenStud_mName = "Ivanovich";
    public static String ChosenStud_Class = "1 Б";
    public static String ChosenStud_DeviceID = "60";
    public static String ChosenStud_DeviceNum = "DV_05";

    public static String ChosenGroupP3 = null;

    public static String Design = "src/Images/Backgrounds/2.jpg";
    public static String DesignName = "Orange lines";

    public static JLabel backlabelNEW;
    public static INIfile CurrentINI = new INIfile();

    public static P2_Statistics StatisticsPanel;
//    public static P2_UserManager UserManagerPanel;
//    public static P3_TriggerManager TriggerManagerPanel;
//    public static P4_PerimetrManager PerimetrManagerPanel;
//    public static P5_AssignParents ParentManagerPanel;
//    public static P6_IDcardManager IDcardManagerPanel;
    public static P7_Settings SettingsPanel;

    public static ArrayList<String> ClientMessages = new ArrayList<String>();

    //public static P2_Statistics StatisticsPanel;
    // public static P2_UserManager UserManagerPanel;
    //public static P3_TriggerManager TriggerManagerPanel;
    //public static P4_PerimetrManager PerimetrManagerPanel;
    // public static P5_ParentManager ParentManagerPanel;
    // public static P6_IDcardManager IDcardManagerPanel;
    //  public static P7_Settings SettingsPanel;
    public static DBConnect DBNewConnection;

}
