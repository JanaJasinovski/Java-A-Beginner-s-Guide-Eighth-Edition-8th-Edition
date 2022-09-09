package Chapter_28;

import java.util.concurrent.Semaphore;

public class SetDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread(sem, "A");
        new DecThread(sem, "B");
    }
}

class Shared {
    static int count = 0;
}

class IncThread implements Runnable {
    String name;
    Semaphore sem;

    public IncThread(Semaphore sem, String nam) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            System.out.println(name);
            sem.acquire();
            System.out.println(name);

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);
        sem.release();
    }
}

class DecThread implements Runnable{
    String name;
    Semaphore sem;

    public DecThread(Semaphore sem, String nam) {
        this.name = name;
        this.sem = sem;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            System.out.println(name);
            sem.acquire();
            System.out.println(name);

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);
        sem.release();
    }
}
