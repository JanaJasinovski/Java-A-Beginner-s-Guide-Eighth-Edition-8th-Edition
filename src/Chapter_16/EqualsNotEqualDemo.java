package Chapter_16;

public class EqualsNotEqualDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String(s1);
        System.out.println(s2.equals(s2));
        System.out.println(s1 == s2);
    }
}
