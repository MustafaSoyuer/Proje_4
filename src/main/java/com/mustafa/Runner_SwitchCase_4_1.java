package com.mustafa;

public class Runner_SwitchCase_4_1 {
    public static void main(String[] args) {

        /**
         *  Java 17 sonrası ;
         *   Guarded Pattern: Pattern matching işlemini yaparken ayrıca farklı koşullar eklememiz gerektiğinde
         *   aşağıdaki gibi case ifadesinin altında if-else ler eklememiz gerekiyor.
         */
        Object o = "10";
        Object result = switch (o) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> {
                if (s.length() > 0) {
                    yield Double.parseDouble(s);
                } else {
                    yield 0d;
                }
            }
            default -> 0d;
        };
        System.out.println(result);





    }
}
