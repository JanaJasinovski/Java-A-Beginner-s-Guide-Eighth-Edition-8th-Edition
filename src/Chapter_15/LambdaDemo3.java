package Chapter_15;

interface NumberTest2{
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    public static void main(String[] args) {
        NumberTest2 isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10,2)) System.out.println("is");
        if(!isFactor.test(10,3)) System.out.println("doesn't");
    }
}
