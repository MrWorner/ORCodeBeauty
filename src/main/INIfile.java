package main;

import java.util.*;
import java.io.*;

/*
* author:  Maxim Godyna TP026670
* version: 1.00, 26.10.2014
* description: Current class creates INI file, saves and reads properties from the INI file
* Available in offline session: YES
* Available version: ALL
 */
public class INIfile {

    public INIfile() {
        File f = new File("settings.ini");
        if (!(f.exists() && !f.isDirectory())) {
            this.createINI();
        };
    }

    public String readOneProp(String Propname) {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("settings.ini"));
            //System.out.print("INIfile readOneProp Reading prop = " + Propname + " ");
            Propname = p.getProperty(Propname);
            //System.out.println("Prop value = " + Propname);
        } catch (Exception e) {
            System.out.println("INIfile readOneProp = " + e);
        }
        return Propname;
    }

    public void changeValue(String PropName, String PropValue) {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("settings.ini"));
            p.list(System.out);
            p.put(PropName, PropValue);
            FileOutputStream out = new FileOutputStream("settings.ini");
            p.save(out, "/* properties created/updated */");
        } catch (Exception e) {
            System.out.println("INIfile write = " + e);
        }
    }

    public void changeStartUpValues(String PropValue1, String PropValue2, String PropValue3, String PropValue4) {
        try {
            Properties p = new Properties();
            p.load(new FileInputStream("settings.ini"));
            // p.list(System.out);
            p.put("autologin", PropValue1);
            if (!PropValue2.equalsIgnoreCase("null")) {
                p.put("username", PropValue2);
            };
            p.put("passw", PropValue3);
            if (!PropValue4.equalsIgnoreCase("null")) {
                p.put("loggedas", PropValue4);
            }

            FileOutputStream out = new FileOutputStream("settings.ini");
            p.save(out, "/* properties created/updated */");
        } catch (Exception e) {
            System.out.println("INIfile write = " + e);
        }
    }

    public void createINI() {
        try {
            PrintWriter writer = new PrintWriter("settings.ini", "UTF-8");
            writer.println("Design=src/Images/Backgrounds/2.jpg");
            writer.println("DesignName=Orange lines");
            System.out.println("INIfile CREATED!");

            writer.close();
        } catch (Exception e) {
            System.out.println("INIfile write = " + e);
        }

    }
}
