/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author MainUser
 */
public class DOMKRATTEST {

    public static void main(String[] args) {

        ArrayList<String> GroupSet1 = new ArrayList<String>();
        ArrayList<String> GroupSet2 = new ArrayList<String>();
        long Iteration = 0;
        String MyString = "";
        String MyString2 = "";

        GroupSet1.add("1 ");
        GroupSet1.add("2 ");
        GroupSet1.add("3 ");
        GroupSet1.add("4 ");
        GroupSet1.add("5 ");
        GroupSet1.add("6 ");
        GroupSet1.add("7 ");
        GroupSet1.add("8 ");
        GroupSet1.add("9 ");
        GroupSet1.add("10 ");
        GroupSet1.add("11 ");

        GroupSet2.add("1 ");
        GroupSet2.add("2 ");
        GroupSet2.add("3 ");
        GroupSet2.add("4 ");
        GroupSet2.add("5 ");
        GroupSet2.add("6 ");
        GroupSet2.add("7 ");
        GroupSet2.add("8 ");
        GroupSet2.add("9 ");
        GroupSet2.add("10 ");
        GroupSet2.add("11 ");

        while (!GroupSet1.isEmpty()) {
            Random r = new Random();
            int size = (GroupSet1.size());
            int Result = r.nextInt(size);

            System.out.println("GroupSet1.size()= " + GroupSet1.size() + " Number = " + Result + " size= " + size);
            MyString = MyString + GroupSet1.get(Result);
            GroupSet1.remove(Result);

        };

        System.out.println("MyString = " + MyString);
        JOptionPane.showMessageDialog(null, "MyString= " + MyString);

        boolean Success = false;
        while (!Success) {

            while (!GroupSet2.isEmpty()) {

                int size = (GroupSet2.size());
                int Result = new Random().nextInt(size);

                // System.out.println("GroupSet1.size()= " + GroupSet2.size() + " Number = " + Result + " size= " + size);
                MyString2 = MyString2 + GroupSet2.get(Result);
                GroupSet2.remove(Result);

            };

            Iteration = Iteration + 1;
            System.out.println("Iteration = " + Iteration);
            System.out.println(" MyString vs MyString2  = " + MyString2);
            if (MyString2.equals(MyString)) {
                System.out.println(" END!");
                Success = true;
                JOptionPane.showMessageDialog(null, " END Iteration= " + Iteration + "    !!!!MyString vs MyString2  = " + MyString + " !! " + MyString2);
            } else {

                MyString2 = "";
                GroupSet2.add("1 ");
                GroupSet2.add("2 ");
                GroupSet2.add("3 ");
                GroupSet2.add("4 ");
                GroupSet2.add("5 ");
                GroupSet2.add("6 ");
                GroupSet2.add("7 ");
                GroupSet2.add("8 ");
                GroupSet2.add("9 ");
                GroupSet2.add("10 ");
                GroupSet2.add("11 ");

            }

        };

    }

}
