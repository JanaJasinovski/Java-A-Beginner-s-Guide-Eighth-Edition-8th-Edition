package Chapter_11;

class NewThread4 implements Runnable{

    String name;
    Thread thread;

    NewThread4(String name){
        this.name = name;
        thread = new Thread(this, name);
        System.out.println(thread);
        thread.start();
    }

    @Override
    public void run() {
        try{
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("finished");
    }
}

public class DemoJoin {
    public static void main(String[] args) {
        NewThread4 ob1 = new NewThread4("One");
        NewThread4 ob2 = new NewThread4("Two");
        NewThread4 ob3 = new NewThread4("Three");

        System.out.println(ob1.thread.isAlive());
        System.out.println(ob2.thread.isAlive());
        System.out.println(ob3.thread.isAlive());

        try {
            System.out.println("waiting for finishing");
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        }catch (InterruptedException e){
            System.out.println(e);
        }
        System.out.println(ob1.thread.isAlive());
        System.out.println(ob2.thread.isAlive());
        System.out.println(ob3.thread.isAlive());
    }
}
