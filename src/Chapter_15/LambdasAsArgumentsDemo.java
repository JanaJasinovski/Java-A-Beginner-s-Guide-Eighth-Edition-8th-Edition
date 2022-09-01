package Chapter_15;

import java.util.Locale;

interface StringFunc2 {
    String func(String n);
}

public class LambdasAsArgumentsDemo {
    static String stringOb(StringFunc2 sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda is the best";
        String outStr;

        System.out.println(inStr);

        outStr = stringOb((str) -> str.toUpperCase(Locale.ROOT), inStr);

        outStr = stringOb((str) -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) != ' '){
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);

        System.out.println(outStr);
    }
}
