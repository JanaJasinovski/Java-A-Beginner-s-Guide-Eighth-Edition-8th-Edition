package Chapter_15;

class MyStringOps{
    String strReverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }
}

public class MethodRedDemo2 {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "lambda is the best";
        String outStr;
        MyStringsOps strOps = new MyStringsOps();
    }
}
