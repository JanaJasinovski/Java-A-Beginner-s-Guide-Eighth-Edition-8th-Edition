package Chapter_2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;

        x = 10;
        y = 20;

        if(x < y){
            System.out.println("x is less then y");
        }

        x *= 2;

        if(x == y){
            System.out.println("x equals y");
        }

        x *= 2;

        if(x > y){
            System.out.println("x is greater then y");
        }

        if(x == y){
            System.out.println("You can't see this result");
        }
    }
}
