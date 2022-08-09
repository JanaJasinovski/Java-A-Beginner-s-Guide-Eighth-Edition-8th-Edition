package Chapter_7;

abstract class A6{
    abstract void callme();

    void callmetoo(){
        System.out.println("it is method");
    }
}

class B6 extends A6 {

    @java.lang.Override
    void callme() {
        System.out.println("it is method in B6");
    }
}

public class AbstracDemo {
    public static void main(String[] args) {
        B6 b6 = new B6();

        b6.callme();;
        b6.callmetoo();
    }
}
