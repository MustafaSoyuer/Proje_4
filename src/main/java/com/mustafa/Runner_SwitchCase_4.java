package com.mustafa;

public class Runner_SwitchCase_4 {
    public static void main(String[] args) {

        /**
         *  Java 17 sonrası ise;
         *  Pattern matching: Diyelim ki elimizde bir değer var ve bu değerin tipine göre casting işlemi
         *  yaparak dönüştürdüğümüz tipin içerdiği metotları kullanarak belli işlemler yapmamız gerekiyor.
         *  Bunun için Java’nın pattern matching özelliğini kullanabiliriz. instanceOf keyword’ü ile bir objenin
         *  hangi sınıfa ait olduğunu boolean bir değer döndürerek kontrol edebiliriz. Ve bu sayede elimizdeki
         *  daha abstract (soyut) olan bir objeyi casting yöntemi ile belli subclass’lara çevirebiliriz.
         */

        Object o = 5;
        double result;
        if (o instanceof Integer) {
            result = ((Integer) o).doubleValue();
        } else if (o instanceof Float) {
            result = ((Float) o).doubleValue();
        } else if (o instanceof String) {
            result = Double.parseDouble(((String) o));
        } else {
            result = 0d;
        }
        System.out.println(result);

        /**
         *  Yukarıdaki örnekte fark edebileceğiniz üzere objenin tipini anlamak ve onu o tipe cast edebilmek için
         *  2 farklı kod satırı yazmamız gerekiyor. Bu da kodun okunmasını ve hataya açık olmasına sebebiyet veriyor.
         *  Java 17 ile birlikte case switch-case labellarına daha farklı tipte objeler ekleyebilmeye ve yine label
         *  expressionında cast edebilmeye başladık. Bu sayede pattern matching özelliğini okunurluğu daha yüksek ve
         *  daha kolay bir şekilde implement edebilmeye başladık.
         */
        Object object = 5;
        Object result1 = switch (object) {
            case Integer i -> i.doubleValue();
            case Float f -> f.toString();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
        System.out.println(result1);



    }
}
