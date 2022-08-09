package Chapter_10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / 0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
