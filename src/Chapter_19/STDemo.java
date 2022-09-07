package Chapter_19;

import java.util.StringTokenizer;

public class STDemo {
    static String in = "gergerger erjhgerg" +
            "egergergergerg";

    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()){
            String key = st.nextToken();
            System.out.println(key);
        }
    }
}
