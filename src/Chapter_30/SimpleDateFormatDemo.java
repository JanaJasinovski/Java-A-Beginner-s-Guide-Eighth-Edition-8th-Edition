package Chapter_30;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat;

        simpleDateFormat = new SimpleDateFormat("hh:mm:ss");
        System.out.println(simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
        System.out.println(simpleDateFormat.format(date));

        simpleDateFormat = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
