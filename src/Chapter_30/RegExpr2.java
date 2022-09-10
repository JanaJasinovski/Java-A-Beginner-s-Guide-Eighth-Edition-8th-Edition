package Chapter_30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr2 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java");;
        Matcher matcher = pattern.matcher("Java 8");

        if(matcher.find()) System.out.println("True");
        else System.out.println("False");
    }
}
