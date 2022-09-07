package Chapter_19;

import java.util.Formatter;

public class FieldWidthDemo {
    public static void main(String[] args) {
        Formatter formatter;

        for (int i = 1; i <= 10; i++) {
            formatter = new Formatter();
            formatter.format("%4d %4d %4d", i, i*i, i*i*i);
            System.out.println(formatter);
            formatter.close();
        }
    }
}
