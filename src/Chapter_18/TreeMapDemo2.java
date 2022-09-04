package Chapter_18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class TComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        k = o1.substring(i).compareTo(o2.substring(i));

        if(k == 0){
            return o1.compareTo(o2);
        }
        else return k;
    }
}

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("John Dou",3434.34);
        tm.put("Tom Smit", 123.22);
        tm.put("Jain Baker", 1378.00);
        tm.put("Tod Holl", 99.22);
        tm.put("Ralf Smit", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry<String, Double> me: set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Dou");
        tm.put("John Dou", balance + 1000);
        System.out.println(tm.get("John Dou"));
    }
}
