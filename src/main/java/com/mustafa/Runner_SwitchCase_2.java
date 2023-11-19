package com.mustafa;

import java.util.Scanner;

public class Runner_SwitchCase_2 {
    public static void main(String[] args) {

        /**
         * Java 8’de switch-case tanımlamalarında String ve Enum type’lar için de kullanılabilir hale geldi.
         */
        /**
         * String kullanımı
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün için bir sayı giriniz");
        int day = scanner.nextInt();
        switch (day) {
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Geçerli bir sayı giriniz.");
        }

    }// main sonu
}// class sonu
