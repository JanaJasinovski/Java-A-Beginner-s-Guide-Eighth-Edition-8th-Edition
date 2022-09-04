package Chapter_18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(ll, r);

        for(int i: ll){
            System.out.println(i + " ");
        }
        Collections.shuffle(ll);

        for(int i: ll){
            System.out.println(i + " ");
        }

        System.out.println(Collections.min(ll));
        System.out.println(Collections.max(ll));
    }
}
