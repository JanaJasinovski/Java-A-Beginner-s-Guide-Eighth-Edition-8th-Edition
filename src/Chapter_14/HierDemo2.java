package Chapter_14;

class NonGen2{
    int num;

    public NonGen2(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}

class Gen5<T> extends NonGen2{
    T ob;

    public Gen5(T o, int num) {
        super(num);
        this.ob = o;
    }

    public T getOb() {
        return ob;
    }
}

public class HierDemo2 {
    public static void main(String[] args) {
        Gen5<String> w = new Gen5<>("Welcome", 47);

        System.out.println(w.getOb() + " ");
        System.out.println(w.getNum());
    }
}
