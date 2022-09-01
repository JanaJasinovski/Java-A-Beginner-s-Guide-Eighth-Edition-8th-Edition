package Chapter_15;

interface Func {
    MyClass func(int n);
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        Func func = MyClass::new;
        MyClass func1 = func.func(100);

        System.out.println(func1.getVal());
    }
}
