package Chapter_30;

import java.util.regex.Pattern;

public class RegExpr9 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[ ,.!]");
        String[] strings = pattern.split("one two, alpha9 12!done.");

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
