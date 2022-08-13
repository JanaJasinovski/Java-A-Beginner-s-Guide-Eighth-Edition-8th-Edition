package Chapter_11;

class NewThread implements Runnable{

    Thread t;

    public NewThread() {
        t = new Thread(this, "demonstration");
        System.out.println(t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
        System.out.println("finished");
    }
}


public class ThreadDemo{
    public static void main(String[] args) {
        new NewThread();

        try {
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