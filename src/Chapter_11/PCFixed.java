package Chapter_11;

class Q1{
    int n;
    boolean valueSet = false;

    synchronized int get(){
        while (!valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
        System.out.println(n);
        valueSet = false;
        notify();

        return n;
    }

    synchronized void put(int n){
        while (valueSet){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println(n);
        notify();
    }
}

class Producer1 implements Runnable{

    Q1 q1;

    Producer1(Q1 q1){
        this.q1 = q1;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            q1.put(i++);
        }
    }
}

class Consumer1 implements Runnable{

    Q1 q1;

    Consumer1(Q1 q1){
        this.q1 = q1;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (true){
            q1.get();
        }
    }
}

public class PCFixed {
    public static void main(String[] args) {
        Q1 q1 = new Q1();
        new Producer1(q1);
        new Consumer1(q1);

    }
}
