package Chapter_16;

public class replaceDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a simple text");

        sb.replace(5, 7, "was");
        System.out.println(sb);
    }
}
