package Chapter_30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpr5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("e.+d");
        Matcher matcher = pattern.matcher("extend cup end table");

        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
