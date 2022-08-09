package Chapter_9;

interface A6 {
    void meth1();
    void meth2();
}

interface B6 {
    void meth3();
}

class MyClass implements B6{
    public void meth1(){
        System.out.println("meth1");
    }

    public void meth2(){
        System.out.println("meth2");
    }

    @Override
    public void meth3() {
        System.out.println("meth3");
    }
}

public class IFExtend {
    MyClass ob = new MyClass();

}
