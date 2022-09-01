package Chapter_17;

public class Elapsed {
    public static void main(String[] args) {
        long start, end;

        start = System.currentTimeMillis();
        for (long i = 0; i < 100000000L; i++) ;
        end = System.currentTimeMillis();


        System.out.println(end - start);
    }
}
