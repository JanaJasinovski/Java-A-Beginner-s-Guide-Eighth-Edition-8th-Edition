package Chapter_2;

public class Conversation {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        b = (byte) i;
        System.out.println(i + " " + b);

        i = (int) d;
        System.out.println(i + " " + d);

        b = (byte) d;

        System.out.println(d + " " + b);

    }
}
