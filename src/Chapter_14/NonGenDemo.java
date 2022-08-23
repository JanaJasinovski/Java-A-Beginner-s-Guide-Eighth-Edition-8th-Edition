package Chapter_14;

class NonGen {
    Object ob;

    public NonGen(Object ob) {
        this.ob = ob;
    }

    public Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen iob;

        iob = new NonGen(88);
        int v = (Integer) iob.getOb();
        System.out.println(v);

        NonGen strOb = new NonGen("Text for generics");
        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println(str);

        iob = strOb;
        v = (Integer) iob.getOb();
    }
}
