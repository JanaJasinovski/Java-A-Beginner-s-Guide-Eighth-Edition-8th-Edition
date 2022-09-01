package Chapter_15;

interface NumericTest{
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> (n % 2) == 0;

        if(isEven.test(10)) System.out.println("is");
        if(!isEven.test(9)) System.out.println("doesn't");

        NumericTest isNonNeg = (n) -> n >= 0;

        if(isNonNeg.test(1)) System.out.println("positiv");
        if(!isNonNeg.test(-1)) System.out.println("negative");
    }
}
