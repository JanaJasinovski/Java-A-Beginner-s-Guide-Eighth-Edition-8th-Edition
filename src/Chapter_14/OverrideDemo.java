package Chapter_14;

class Gen8<T>{
    T ob;

    public Gen8(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.println("Gen8");
        return ob;
    }
}

class Gen9<T> extends Gen8<T>{

    public Gen9(T ob) {
        super(ob);
    }

    @Override
    public T getOb(){
        System.out.println("Gen9");
        return ob;
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Gen8<Integer> iob = new Gen8<>(88);
        Gen9<Integer> iob2 = new Gen9<>(99);

        Gen9<String> strOb2 = new Gen9<>("Text of message");
        System.out.println(iob.getOb());
        System.out.println(iob2.getOb());
        System.out.println(strOb2.getOb());
    }
}
