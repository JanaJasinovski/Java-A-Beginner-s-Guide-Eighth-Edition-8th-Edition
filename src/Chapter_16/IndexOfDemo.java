package Chapter_16;

public class IndexOfDemo {
    public static void main(String[] args) {
        String s = "Not is the time for all good men" +
                "to come to the aid of their country.";

        System.out.println(s);
        System.out.println(s.indexOf('t'));
        System.out.println(s.indexOf("the"));
        System.out.println(s.lastIndexOf("the"));
        System.out.println(s.indexOf('t', 10));
        System.out.println(s.lastIndexOf('t', 60));
        System.out.println(s.indexOf("the", 10));
        System.out.println(s.lastIndexOf("the", 60));
    }
}
