package Chapter_30;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.UK);
        System.out.println(dateFormat.format(date));

        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);
        System.out.println(dateFormat.format(date));
    }
}
