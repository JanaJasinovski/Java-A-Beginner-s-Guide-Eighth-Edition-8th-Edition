package Chapter_17;

class NewThread extends Thread {
    boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb){
        super(tgOb, threadname);
        System.out.println(this);
        suspendFlag = false;
        start();
    }

    public void run(){
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this){
                    while (suspendFlag){
                        wait();
                    }
                }
            }
        }catch (Exception e){
            System.out.println(getName());
        }

        System.out.println(getName() + " closed");
    }

    synchronized void mysuspend(){
        suspendFlag = true;
    }

    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}

public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThread ob1 = new NewThread("One", groupA);
        NewThread ob2 = new NewThread("Two", groupA);
        NewThread ob3 = new NewThread("Three", groupB);
        NewThread ob4 = new NewThread("Four", groupB);

        groupA.list();
        groupB.list();
        System.out.println();

        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);

        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).mysuspend();
        }

        try {
            Thread.sleep(4000);
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupt");
        }

        for (int i = 0; i < tga.length; i++) {
            ((NewThread) tga[i]).myresume();
        }

        try {
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        }catch (Exception e){
            System.out.println("Exception is main thread");
        }

        System.out.println("over");
    }
}
