package Chapter_16;

public class IndexOfDemo2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("one two one");
        int i;

        i = sb.indexOf("one");
        System.out.println(i);

        i = sb.lastIndexOf("one");
        System.out.println(i);
    }
}
