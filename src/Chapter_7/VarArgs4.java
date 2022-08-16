package Chapter_7;

public class VarArgs4 {

    static void vaTest(int ... v){
        System.out.print(v.length);

        for(int x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.println(v.length);

        for (boolean x: v){
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
    }
}