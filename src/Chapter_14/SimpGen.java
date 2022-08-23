package Chapter_14;

class TwoGen<T, V> {
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showTypes(){
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    public T getOb1() {
        return ob1;
    }

    public V getOb2() {
        return ob2;
    }
}

public class SimpGen{
    public static void main(String[] args) {
        TwoGen<Integer, String> thObj = new TwoGen<>(88, "Generic");

        thObj.showTypes();

        int v = thObj.getOb1();
        System.out.println(v);

        String str = thObj.getOb2();
        System.out.println(str);

    }
}
