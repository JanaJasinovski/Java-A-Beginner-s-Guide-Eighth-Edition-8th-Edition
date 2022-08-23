package Chapter_14;

class Gen<T> {
    T ob;

    Gen(T o){
        ob =  o;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println(ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println(v);
        Gen<String> strOb = new Gen<>("Text of message");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println(str);
    }
}
