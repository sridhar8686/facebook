package com.InetBanking.pageobject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetoString {
    public static void main(String[] args) {
        // Example Integer date
        Integer integerDate = 20240225;

        // Convert Integer date to String
        String stringDate = convertIntegerDateToString(integerDate);

        System.out.println("String Date: " + stringDate);
    }

    public static String convertIntegerDateToString(Integer integerDate) {
        if (integerDate == null) {
            return null;
        }

        // Convert Integer date to String format "yyyyMMdd"
        String dateString = String.valueOf(integerDate);
        
        // Parse the date string to a Date object
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date;
        try {
            date = dateFormat.parse(dateString);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }

        // Format the Date object to the desired string format
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd");
        return outputFormat.format(date);
    }
}
