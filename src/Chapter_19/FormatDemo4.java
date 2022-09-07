package Chapter_19;

import java.util.Formatter;

public class FormatDemo4 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("|%f|%n|%12f|%n|%012f|", 10.12345, 10.12345, 10.12345);

        System.out.println(formatter);
        formatter.close();
    }
}
