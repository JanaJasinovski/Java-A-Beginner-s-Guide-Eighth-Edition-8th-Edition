package Chapter_15;

interface myfunc<R, T> {
    R func(T n);
}

class MyClass3<T> {
    private T val;

    public MyClass3(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

class MyClass31 {
    String str;

    public MyClass31(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

public class ConstructorRefDemo3 {
    static <R, T> R myClassFactory(myfunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        myfunc<MyClass3<Double>, Double> m = MyClass3<Double>::new;

        MyClass3<Double> m2 = myClassFactory(m, 100.1);

        System.out.println(m2.getVal());

        myfunc<MyClass31, String> m3 = MyClass31::new;
        MyClass31 m4 = myClassFactory(m3, "Lambda");

        System.out.println(m4.getStr());
    }
}
