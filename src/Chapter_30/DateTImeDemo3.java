package Chapter_30;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTImeDemo3 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MMMM d', ' yyyy h': 'mm a")));
    }
}
