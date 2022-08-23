package Chapter_14;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y){
        for (int i = 0; i < y.length; i++) {
            if(x.equals(y[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if(isIn(2, nums))
            System.out.println("2 is in massiv");

        if(!isIn(7, nums))
            System.out.println("7 isn't in massiv");

        System.out.println();

        String[] str = {"one", "two", "three", "four", "five"};

        if(isIn("two", str)){
            System.out.println("two constains in strs");
        }

        if(!isIn("seven", str)){
            System.out.println("seven doesn't contain in strs");
        }
    }
}
