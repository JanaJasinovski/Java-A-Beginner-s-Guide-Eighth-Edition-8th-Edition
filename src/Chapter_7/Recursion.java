package Chapter_7;

class Factorial{
    int fact(int n){
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;

        return result;
    }
}

public class Recursion {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        System.out.println(factorial.fact(3));
        System.out.println(factorial.fact(4));
        System.out.println(factorial.fact(5));
    }
}
