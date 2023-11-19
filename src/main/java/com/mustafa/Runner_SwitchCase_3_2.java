package com.mustafa;

public class Runner_SwitchCase_3_2 {
    public static void main(String[] args) {

        /**
         * Java 14 sonrasında switch-case kullanımıyla ilgili ;
         * switch içinde yer alan değerin farklı case’leri için aynı işlem yapılabilmesini
         * sağlamak için tek bir case ifadesine farklı labellar yazılabilir hale geldi.
         */
        String day ="";

        String type = switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Week day";
            case "Saturday", "Sunday" -> "Weekend";
            default->"Unknown";
        };



    }
}
