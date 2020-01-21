/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test_TimeDate {

    String[] MonthsRUS = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    String[] WeeksRUS = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

    public static void main(String[] argv) {
        // TODO code application logic here
        Test_TimeDate ThisApp = new Test_TimeDate();
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = new Date();
        System.out.println("dateFormat: " + dateFormat.format(date));

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        System.out.println("dateFormat: " + new SimpleDateFormat("EE").format(date));
        String week = null;
        week = new SimpleDateFormat("EE").format(date);

        ThisApp.GetWeekName_RUS(week);

        Calendar cal = Calendar.getInstance();
        System.out.println(new SimpleDateFormat("MMM").format(cal.getTime()));

        ThisApp.GetMonthName_RUS(new SimpleDateFormat("MMM").format(cal.getTime()));

        ThisApp.GetDurationFromTwoDates("");
        ThisApp.totalTime();
    }

    public void GetWeekName_RUS(String WeekName) {

        switch (WeekName) {
            case "Mon":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[0]);
                break;
            case "Tue":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[1]);
                break;
            case "Wed":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[2]);
                break;
            case "Thu":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[3]);
                break;
            case "Fri":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[4]);
                break;
            case "Sat":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[5]);
                break;
            case "Sun":
                System.out.println("WeekName: " + WeekName + " = " + WeeksRUS[6]);
                break;
            default:
                break;
        }
    }

    public void GetMonthName_RUS(String MonthName) {

        switch (MonthName) {
            case "January":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[0]);
                break;
            case "February":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[1]);
                break;
            case "March":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[2]);
                break;
            case "April":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[3]);
                break;
            case "May":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[4]);
                break;
            case "June":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[5]);
                break;
            case "July":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[6]);
                break;
            case "August":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[7]);
                break;
            case "September":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[8]);
                break;
            case "October":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[9]);
                break;
            case "November":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[10]);
                break;
            case "December":
                System.out.println("WeekName: " + MonthName + " = " + MonthsRUS[11]);
                break;
            default:
                break;
        }
    }

    private void GetDurationFromTwoDates(String DateFromDB) {

        DateFromDB = "05/24/2016 10:00:00";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date date = new Date();
        String TimeNOW = format.format(date);
        //HH converts hour in 24 hours format (0-23), day calculation

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(DateFromDB);
            d2 = format.parse(TimeNOW);

            //in milliseconds
            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);
            long totalMinutes = (diffHours * 60) + diffMinutes + (diffSeconds / 60) + ((diffDays * 24) * 60);
            System.out.print("GetDurationFromTwoDates(): " + diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.println(diffSeconds + " seconds.");

            System.out.println(totalMinutes + " totalMinutes.");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void totalTime(String... times) {
        int total = 0;
        for (String time : times) {
            String[] splits = time.split(":");
            total += (Integer.parseInt(splits[0]) * 60 + Integer.parseInt(splits[1]));
        }

        System.out.print("totalTime: " + total / 60 + ":" + total % 60);
        return;
    }

}
