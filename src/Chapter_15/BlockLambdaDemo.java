package Chapter_15;

interface NumericFunc{
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for (int i = 1; i <= n; i++) {
                result = i * result;
            }

            return result;
        };

        System.out.println(factorial.func(3));
        System.out.println(factorial.func(5));
    }
}
