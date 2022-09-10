package Chapter_30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println(dateFormat.format(date));
    }
}
