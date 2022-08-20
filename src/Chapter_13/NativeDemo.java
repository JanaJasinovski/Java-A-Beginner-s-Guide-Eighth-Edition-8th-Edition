package Chapter_13;

public class NativeDemo {
    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;

        System.out.println(ob.i);
        ob.test();
        System.out.println(ob.i);
    }

    public native void test();

    static {
        System.loadLibrary("NativeDemo");
    }
}
