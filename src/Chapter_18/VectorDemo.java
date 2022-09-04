package Chapter_18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println(v.size());
        System.out.println(v.capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);

        System.out.println(v.capacity());

        v.add(5);
        System.out.println(v.capacity());

        v.add(6);
        v.add(7);

        System.out.println(v.capacity());

        v.addElement(9);
        v.addElement(10);

        System.out.println(v.capacity());

        v.addElement(11);
        v.addElement(12);

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        if(v.contains(3)){
            System.out.println("yes");
        }

        Enumeration<Integer> vnum = v.elements();
        while (vnum.hasMoreElements()){
            System.out.println(vnum.nextElement() + " ");
        }
        System.out.println();
    }
}
