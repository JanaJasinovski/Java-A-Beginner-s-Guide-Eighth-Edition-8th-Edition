package Chapter_11;

class Callme{
    void call(String msg){
        System.out.print(msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println();
    }
}

class Caller implements Runnable{

    String msg;
    Callme target;
    Thread thread;

    public Caller(Callme target, String msg) {
        this.target = target;
        this.msg = msg;
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller caller1 = new Caller(target, "Welcome");
        Caller caller2 = new Caller(target, "in synchronized");
        Caller caller3 = new Caller(target, "worlds!");

        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
