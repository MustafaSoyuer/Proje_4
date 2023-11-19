package com.mustafa;

public class Runner_SwitchCase_3_1 {
    public static void main(String[] args) {

        /**
         *  Java 14 sonrasında switch-case kullanımıyla ilgili ;
         *  case statement’ı arrow operator olarak tanımlanabilir hale geldi.
         *  Yield yerine bu kullanım daha okunur olduğu için bu ifadenin tercih edilmesi daha faydalı olabilir.
         */
        String day ="";

        String type = switch (day) {
            case "Monday"-> "Week day";
            case "Tuesday"-> "Week day";
            case "Wednesday"->"Week day";
            case "Thursday"->"Week day";
            case "Friday"->"Week day";
            case "Saturday"-> "Weekend";
            case "Sunday"-> "Weekend";
            default->"Unknown";
        };




    }
}
