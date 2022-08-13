package Chapter_11;

class A{
    synchronized void foo(B b){
        String name = Thread.currentThread().getName();
        System.out.println(name);

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("class A is interrupted");
        }

        System.out.println(name + " is trying to call a method B.last()");
        b.last();
    }

    synchronized void last(){
        System.out.println("In method A.last()");
    }
}

class B{
    synchronized void bar(A a){
        String name = Thread.currentThread().getName();
        System.out.println(name);

        try {
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println("Class B is interrupted");
        }
        System.out.println(name + " is trying to call a method A.last()");
        a.last();
    }

    synchronized void last(){
        System.out.println("In method A.last()");
    }
}
public class Deadlock implements Runnable {

    A a = new A();
    B b = new B();

    Deadlock(){
        Thread.currentThread().setName("Main thread");
        Thread thread = new Thread(this, "Not main thread");
        thread.start();

        a.foo(b);
        System.out.println("Back to main thread");
    }

    @Override
    public void run() {
        b.bar(a);
        System.out.println("Back to the another thread");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
