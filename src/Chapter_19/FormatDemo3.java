package Chapter_19;

import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("%d%%", 88);
        System.out.println(formatter);
        formatter.close();
    }
}
