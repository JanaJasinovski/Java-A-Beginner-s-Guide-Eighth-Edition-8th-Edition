package Chapter_14;

class Gen6<T> {
    T ob;

    public Gen6(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen7<T> extends Gen6<T> {
    public Gen7(T o) {
        super(o);
    }
}

public class HierDemo3 {
    public static void main(String[] args) {
        Gen6<Integer> iob = new Gen6<>(88);
        Gen7<Integer> iob2 = new Gen7<>(99);

        Gen7<String> strOb2 = new Gen7<>("text of message");
        if (iob2 instanceof Gen7<?>) {
            System.out.println(" Объект i0b 2 я вляется экзеМIµJяром класса Gen2");
        }
        if (iob2 instanceof Gen6<?> ) System.out.println(" Объект i0b2 является экземпляром класса Gen");
        System.out.println();
        if (strOb2 instanceof Gen7<?> )
            System.out.println(" Объект s trOb2 является экземпляром класса Gen2 ");
        if (strOb2 instanceof Gen6<?> ) System.out.println("Объект &tr0b 2 является экземпляром класса Gen");
        System.out.println();
        if (iob instanceof Gen7<?>) System.out.println(" Объект iOb является экземпляром класса Gen2 ");

    }
}
