package com.mustafa;

import java.util.Scanner;

public class Runner_SwitchCase_3 {
    public static void main(String[] args) {

        /**
         *  Java 14 sonrasında switch-case kullanımıyla ilgili ;
         *  Switch statemen’ı artık bir switch expression’a dönüştü. Yani assign edilebilen,
         *  return edilebilen bir yapıya kavuştu. Fakat return edilecek ifadeden önce yield kullanılması gerekir:
         */
        String day = "";


        String type =
                switch (day) {
                    case "Monday":
                        yield "Weekday";
                    case "Tuesday":
                        yield "Weekday";
                    case "Wednesday":
                        yield "Weekday";
                    case "Thursday":
                        yield "Weekday";
                    case "Friday":
                        yield "Weekday";
                    case "Saturday":
                        yield "Weekend";
                    case "Sunday":
                        yield "Weekend";
                    default:
                        yield "Unknown";
                };






    }// main sonu
}// class sonu
