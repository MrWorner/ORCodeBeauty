/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class DBConnect {

    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection connection = null;

    public DBConnect() {

//        try {
//            Class.forName("org.postgresql.Driver");
//        } catch (ClassNotFoundException e) {
//            JOptionPane.showMessageDialog(null, "Драйвер PostgreSQL JDBC не был найден! Подключение невозможно. Подробнее: " + e);
//            e.printStackTrace();
//            return;
//        }
//
//        //System.out.println("PostgreSQL JDBC драйвер найден!");  
//        System.out.println("DB соединение!"); 
//        try {
//            //connection = DriverManager.getConnection(
//            //        "jdbc:postgresql://127.0.0.1:5432/school_security", "school_admin",
//            //        "777333");
//            
//             connection = DriverManager.getConnection(
//                    "jdbc:postgresql://127.0.0.1:5432/school_security", "postgres",
//                    "777333");
//
//           stmt = connection.createStatement();
//        /** rs = stmt.executeQuery(" SELECT * FROM school.student");
//            while (rs.next()) {
//                System.out.print(rs.getInt(1) + "\t");
//                System.out.println(rs.getString(2));
//            }
//            //connection.close();
//         **/
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Соединение прервано. Подробнее: " + e);
//            e.printStackTrace();
//            return;
//        }
    }

//    public ResultSet EXESQL(String query, String NameFunc) throws IOException {
//
////        try {
////            rs = stmt.executeQuery(query);
////        } catch (Exception ex) {
////            System.out.println("Произошла ошибка в EXESQL. Подробнее: " + ex + " при попытке SQL кода: " + query);
////            JOptionPane.showMessageDialog(null, "Из функции: " + NameFunc + "|Произошла ошибка в EXESQL. Подробнее: " + ex + " при попытке SQL кода: " + query);
////            ex.printStackTrace();
////        }
////        //System.out.println("EXESQL, results OUT!");
////        return rs;
//    }

    public void EXESQLVOID(String query, String NameFunc) throws IOException {

//        try {
//            stmt.executeUpdate(query);
//        } catch (Exception ex) {
//            System.out.println("Из функции: " + NameFunc + "Произошла ошибка в EXESQLVOID. Подробнее: " + ex + " при попытке SQL кода: " + query);
//            JOptionPane.showMessageDialog(null, "Из функции: " + NameFunc +"Произошла ошибка в EXESQLVOID. Подробнее: " + ex + " при попытке SQL кода: " + query);
//            ex.printStackTrace();
//        }
    }

     public void Disconnect(){
       
//         try {
//            connection.close();
//            System.out.println("Отсоединение от баз данных завершено!");
//        } catch (SQLException ex) {
//            System.out.println("Произошла ошибка в DBConnect.Disconnect(). Подробнее: " + ex);
//            JOptionPane.showMessageDialog(null, "Произошла ошибка в DBConnect.Disconnect(). Подробнее: " + ex);
//            ex.printStackTrace();
//        }
  
    }
    
}
