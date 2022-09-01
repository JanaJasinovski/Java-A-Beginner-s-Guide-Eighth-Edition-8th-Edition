package Chapter_16;

public class StringJoinDemo {
    public static void main(String[] args) {
        String result = String.join(" ", "Alpha", "Beta",
                "Gamma");

        System.out.println(result);

        result = String.join(", ", "Join", "ID#: 569",
                "E-mail: John@HerbSchildt.com");

        System.out.println(result);
    }
}
