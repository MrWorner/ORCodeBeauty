/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCExample {

    public static void main(String[] argv) {

        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/school_security", "school_admin",
                    "777333");
            try {
                // Thread.sleep(4000);
                Thread.sleep(300000);//10 min
                System.out.println("10/60 min passed");
                Thread.sleep(300000);//10 min
                System.out.println("20/60 min passed");
                Thread.sleep(300000);//10 min
                System.out.println("30/60 min passed");
                Thread.sleep(300000);//10 min
                System.out.println("40/60 min passed");
                Thread.sleep(300000);//10 min
                System.out.println("50/60 min passed");
                Thread.sleep(300000);//10 min
                System.out.println("60/60 min passed");
            } catch (InterruptedException ex) {
                Logger.getLogger(JDBCExample.class.getName()).log(Level.SEVERE, null, ex);
            }

            Statement stmt = null;
            ResultSet rs = null;
            stmt = connection.createStatement();
            rs = stmt.executeQuery(" SELECT * FROM school.student");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "\t");
                System.out.println(rs.getString(2));
            }
            System.out.println("60/60 min passed CLOSING CONNECTION!");
            connection.close();
            System.out.println("60/60 min passed CLOSED!!!");
        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console: ");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
    }

}
