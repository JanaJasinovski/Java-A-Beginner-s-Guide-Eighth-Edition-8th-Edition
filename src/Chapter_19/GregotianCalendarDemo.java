package Chapter_19;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregotianCalendarDemo {
    public static void main(String[] args) {
        String[] months = {
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };

        int year = 2022;

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(months[gregorianCalendar.get(Calendar.MONTH)]);
        System.out.println(gregorianCalendar.get(Calendar.DATE));
        System.out.println(gregorianCalendar.get(Calendar.YEAR));
        System.out.println(gregorianCalendar.get(Calendar.HOUR));
        System.out.println(gregorianCalendar.get(Calendar.MINUTE));
        System.out.println(gregorianCalendar.get(Calendar.SECOND));

        if(gregorianCalendar.isLeapYear(year)){
            System.out.println("leap year");
        }else {
            System.out.println("isn't leap year");
        }
    }
}
