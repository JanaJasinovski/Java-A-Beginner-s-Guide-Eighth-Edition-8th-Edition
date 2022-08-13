package Chapter_11;

class Callme1{
    void call(String msg){
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("]");
    }
}

class Caller1 implements Runnable{

    String msg;
    Callme1 target;
    Thread thread;

    public Caller1(Callme1 callme1, String s){
        target = callme1;
        msg = s;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}

public class Synch1 {
    public static void main(String[] args) {
        Callme1 callme1 = new Callme1();
        Caller1 caller1 = new Caller1(callme1, "Welcome");
        Caller1 caller2 = new Caller1(callme1, "in synchronized");
        Caller1 caller3 = new Caller1(callme1, "worlds!");

        try {
            caller1.thread.join();
            caller2.thread.join();
            caller3.thread.join();
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
