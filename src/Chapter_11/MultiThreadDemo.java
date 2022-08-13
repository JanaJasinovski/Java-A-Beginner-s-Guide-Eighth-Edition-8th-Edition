package Chapter_11;

class NewThread3 implements Runnable{

    String name;
    Thread thread;

    NewThread3(String name){
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

public class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread3("One");
        new NewThread3("Two");
        new NewThread3("Three");

        try {
            Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }

        System.out.println("finished");
    }
}
