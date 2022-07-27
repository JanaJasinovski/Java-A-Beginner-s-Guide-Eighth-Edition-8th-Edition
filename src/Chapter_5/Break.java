package Chapter_5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("for break");
                    if(t) break second;
                    System.out.println("not working");
                }
                System.out.println("not working");
            }
            System.out.println("not working");
        }
    }
}
