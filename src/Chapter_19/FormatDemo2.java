package Chapter_19;

import java.util.Formatter;

public class FormatDemo2 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        for (double i = 1.23; i < 1.0e+6; i++) {
            formatter.format("%f;%e", i ,i);
            System.out.println(formatter);
        }
        formatter.close();
    }
}
