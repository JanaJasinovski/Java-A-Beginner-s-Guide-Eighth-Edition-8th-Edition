package Chapter_11;

class NewThread2 extends Thread {
    NewThread2() {
        super("demonstration");
        System.out.println(this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
        System.out.println("finished");
    }
}

public class ExtendThred{
    public static void main(String[] args) {
        new NewThread2();
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
