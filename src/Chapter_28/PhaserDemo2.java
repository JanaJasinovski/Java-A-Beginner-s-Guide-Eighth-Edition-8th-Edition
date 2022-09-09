package Chapter_28;

import java.util.concurrent.Phaser;

class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numPhases) {
        super(parties);
        this.numPhases = numPhases - 1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println(phase);
        if(phase == numPhases || registeredParties == 0) return true;
        return false;
    }
}

public class PhaserDemo2 {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1,4);
        new MyThread4(phaser, "A");
        new MyThread4(phaser, "B");
        new MyThread4(phaser, "C");

        while (!phaser.isTerminated()){
            phaser.arriveAndAwaitAdvance();
        }
    }
}

class MyThread4 implements Runnable {
    Phaser phaser;
    String name;

    public MyThread4(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()){
            System.out.println(name + ": " + phaser.getPhase());

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
