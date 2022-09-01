package Chapter_15;

interface func<T>{
    MyClass2<T> func(T n);
}

class MyClass2<T> {
    private T val;

    public MyClass2(T val) {
        this.val = val;
    }

    public T getVal() {
        return val;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        func<Integer> m = MyClass2<Integer>::new;
        MyClass2<Integer> m2 = m.func(100);

        System.out.println(m2.getVal());
    }
}
