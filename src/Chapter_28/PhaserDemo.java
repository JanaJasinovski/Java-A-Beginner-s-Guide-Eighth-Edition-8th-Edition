package Chapter_28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;
        new MyThread3(phaser , "A");
        new MyThread3(phaser , "B");
        new MyThread3(phaser , "C");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(curPhase);

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println(curPhase);

        phaser.arriveAndDeregister();
        if(phaser.isTerminated()){
            System.out.println("all");
        }
    }
}

class MyThread3 implements Runnable {
    Phaser phaser;
    String name;

    public MyThread3(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name);
        phaser.arriveAndAwaitAdvance();
    }
}