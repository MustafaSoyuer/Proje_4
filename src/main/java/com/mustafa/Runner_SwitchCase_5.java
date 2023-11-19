package com.mustafa;

import java.util.Scanner;

public class Runner_SwitchCase_5 {
    public static void main(String[] args) {

        /**
         *  switch..case in bu kullanımında ;
         *  şartı sağlayan koşulları bir case içinde yazdıktan sonra kod yazılabilir.
         *  tek sonuç ve tek break komutu kullanmak kodu daha kısa ve kullanışlı yapar.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gün için bir sayı giriniz");
        int gun = scanner.nextInt();

        switch (gun){
            case 1 , 2 , 3 , 4, 5:
                System.out.println("Haftaiçi");
                break;
            case 6 , 7  :
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Geçersiz sayı girdiniz");
        }



    }// main sonu
}// class sonu
