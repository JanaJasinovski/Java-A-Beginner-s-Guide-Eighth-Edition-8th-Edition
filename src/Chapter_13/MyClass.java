package Chapter_13;

public class MyClass {
    int a, b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }
}
