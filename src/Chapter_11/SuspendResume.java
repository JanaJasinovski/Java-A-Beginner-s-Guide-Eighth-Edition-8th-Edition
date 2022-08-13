package Chapter_11;

class NewThread1 implements Runnable{

    String name;
    Thread thread;
    boolean suspendFlag;

    public NewThread1(String name) {
        this.name = name;
        thread = new Thread(this, name);
        System.out.println("New thread: " + thread);
        suspendFlag = false;
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (InterruptedException e){
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + " is over");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}

public class SuspendResume {
    public static void main(String[] args) {
        NewThread1 newThread1 = new NewThread1("One");
        NewThread1 newThread2 = new NewThread1("Two");

        try {
            Thread.sleep(1000);
            newThread1.mysuspend();
            System.out.println("Stop for first thread");
            Thread.sleep(1000);
            newThread1.myresume();
            System.out.println("Continue working first thread");
            newThread2.mysuspend();
            System.out.println("Stop for second thread");
            Thread.sleep(1000);
            newThread2.myresume();
            System.out.println("Continue working second thread");
        }catch (InterruptedException e){
            System.out.println("Main thread is over");
        }

        try {
            System.out.println("Waiting for ending all threads.");
            newThread1.thread.join();
            newThread2.thread.join();
        }catch (InterruptedException e){
            System.out.println("Main thread");
        }

        System.out.println("Main thread is over");
    }
}
