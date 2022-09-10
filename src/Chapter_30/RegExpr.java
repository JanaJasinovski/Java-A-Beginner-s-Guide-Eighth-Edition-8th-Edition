package Chapter_30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr {
    public static void main(String[] args) {
        Pattern pattern;
        Matcher matcher;
        boolean found;

        pattern = Pattern.compile("Java");
        matcher = pattern.matcher("Java");
        found = matcher.matches();

        if(found) System.out.println("True");
        else System.out.println("False");

        matcher = pattern.matcher("Java 8");
        found = matcher.matches();

        if(found) System.out.println("True");
        else System.out.println("False");
    }
}
