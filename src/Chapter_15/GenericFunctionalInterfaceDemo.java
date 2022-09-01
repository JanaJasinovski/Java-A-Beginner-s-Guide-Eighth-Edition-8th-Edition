package Chapter_15;

interface SomeFunc<T> {
    T func(T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(reverse.func("Lambda"));
        System.out.println(reverse.func("Reverse"));

        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };

        System.out.println(factorial.func(3));
        System.out.println(factorial.func(5));
    }
}
