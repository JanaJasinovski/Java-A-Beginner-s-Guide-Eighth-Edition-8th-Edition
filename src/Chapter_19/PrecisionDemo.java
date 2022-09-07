package Chapter_19;

import java.util.Formatter;

public class PrecisionDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("%.4f", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%16.2e", 123.1234567);
        System.out.println(formatter);
        formatter.close();

        formatter = new Formatter();
        formatter.format("%.15s", "123.1234567");
        System.out.println(formatter);
        formatter.close();
    }
}
