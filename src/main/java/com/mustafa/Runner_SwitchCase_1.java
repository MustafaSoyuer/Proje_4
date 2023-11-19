package com.mustafa;

public class Runner_SwitchCase_1 {
    public static void main(String[] args) {
        /**
         *  switch..case :
         *  Bir değeri incelemek ve kontrol etmek için birebir uyuma bakar ve eğer doğru ise kod çalışır.
         *  çalışma şekli ;
         * 1- Switch ifadesi bi kere okunur.
         * 2- İfadenin değeri her bir case ile karşılaştırılır.
         * 3- Eğer bir case bloğu ile eşleşirse o bloğun içerisindeki kodlar çalıştırılır.
         * 4- Eğer bir break ifadesi varsa switch ifadesi kırılır ve program switch ifadesini
         *    atlayarak yaşam döngüsüne devam eder.
         * 5- Eğer hiçbir case ile eşleşme olmazsa default adında oluşturulan durumun içerisindeki kod bloğu yürütülür.
         * Syntax :
         * switch(value){
         *     case x : kad ; break;
         *     case y : kod ; break;
         *     default: kod ;
         * }
         *
         *  Java 7’ye kadar switch-case tanımlamalarında sadece
         *  integer değerde bir variable’ın koşulları kullanılabiliyordu.
         */

        int value = 6;
        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 6:
                System.out.println("Six");
                break;
            default:
                System.out.println("Unknown");
        }







    }// main sonu
}// class sonu