package Chapter_16;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
