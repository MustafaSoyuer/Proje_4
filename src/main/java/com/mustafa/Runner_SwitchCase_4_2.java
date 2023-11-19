package com.mustafa;

public class Runner_SwitchCase_4_2 {
    public static void main(String[] args) {

        /**
         *  Java 17 sonrası ;
         *  Null Cases: Java 17 öncesinde, switch-case’e geçmiş olduğunuz bir değerin asla null olmaması gerekiyordu.
         *  Artık Java 17 ile birlikte bu kısıt kaldırıldı ve null olması durumu case labelları ile ele alınabilir hale geldi.
         */
        Object o = null;

        Object result = switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case null -> 0d;
            default -> 0d;
        };



    }
}
