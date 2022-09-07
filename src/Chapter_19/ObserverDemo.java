package Chapter_19;

import java.util.Observable;
import java.util.Observer;

class Watcher implements Observer{
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(((Integer) arg).intValue());
    }
}

class BeingWatched extends Observable{
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

public class ObserverDemo {
    public static void main(String[] args) {
        BeingWatched observed = new BeingWatched();
        Watcher watcher = new Watcher();
        observed.addObserver(watcher);
        observed.counter(10);
    }
}
