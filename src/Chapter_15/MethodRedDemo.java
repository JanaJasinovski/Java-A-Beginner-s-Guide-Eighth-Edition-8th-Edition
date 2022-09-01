package Chapter_15;

class MyStringsOps {
    static String strReverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}

public class MethodRedDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda is the best";
        String outStr;

        outStr = stringOp(MyStringsOps::strReverse, inStr);

        System.out.println(inStr);
        System.out.println(outStr);
    }
}
