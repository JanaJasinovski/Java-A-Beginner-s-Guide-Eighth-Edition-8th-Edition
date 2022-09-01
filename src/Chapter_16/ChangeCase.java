package Chapter_16;

import java.util.Locale;

public class ChangeCase {
    public static void main(String[] args) {
        String s = "This test.";
        System.out.println(s);

        String upper = s.toUpperCase(Locale.ROOT);
        String lower = s.toLowerCase(Locale.ROOT);
        System.out.println(upper);
        System.out.println(lower);
    }
}
