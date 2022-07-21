package Chapter_2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;

        y = 20;

        for (x = 0; x < 10; x++) {
            System.out.println("Value of i: " + x);
            System.out.println("Value of y: " + y);
            y -= 2;
        }
    }
}
