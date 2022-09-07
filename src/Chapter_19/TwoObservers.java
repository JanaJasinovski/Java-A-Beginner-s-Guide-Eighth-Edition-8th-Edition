package Chapter_19;

import java.util.Observable;
import java.util.Observer;

class Watcher1 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((Integer) arg).intValue());
    }
}

class Watcher2 implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if(((Integer) arg).intValue() == 0)
        System.out.println("Ready " + "\7");
    }
}

class BeingWatched1 extends Observable{
    void counter(int period){
        for (; period >= 0; period--) {
            setChanged();
            notifyObservers(period);
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        }
    }
}

public class TwoObservers {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher watcher1 = new Watcher();
        Watcher watcher2 = new Watcher();
        observed.addObserver(watcher1);
        observed.addObserver(watcher2);
        observed.counter(10);
    }
}
