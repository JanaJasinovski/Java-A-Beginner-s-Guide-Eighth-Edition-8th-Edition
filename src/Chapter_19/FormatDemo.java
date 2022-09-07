package Chapter_19;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        formatter.format("%s;%d;%f", "java", 10, 98.6);
        System.out.println(formatter);
        formatter.close();
    }
}
