package Chapter_19;

import java.util.Calendar;
import java.util.Formatter;

public class TimeDateFormat {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        formatter.format("%tr", calendar);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tc", calendar);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tl:%tM", calendar, calendar);
        System.out.println(formatter);

        formatter = new Formatter();
        formatter.format("%tB %tb %tm", calendar, calendar,calendar);
        System.out.println(formatter);

        formatter.close();
    }
}
