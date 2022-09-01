package Chapter_16;

public class deleteDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a simple text");

        sb.delete(2, 11);
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
