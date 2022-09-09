package Chapter_28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch cdl = new CountDownLatch(5);
        new MyThread(cdl);

        try {
            cdl.await();
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }
}

class MyThread implements Runnable {
    CountDownLatch countDownLatch;

    public MyThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            countDownLatch.countDown();
        }
    }
}
