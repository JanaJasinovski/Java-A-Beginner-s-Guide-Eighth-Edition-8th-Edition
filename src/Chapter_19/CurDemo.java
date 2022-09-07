package Chapter_19;

import java.util.Currency;
import java.util.Locale;

public class CurDemo {
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.US);

        System.out.println(c.getSymbol());
        System.out.println(c.getDefaultFractionDigits());
    }
}
