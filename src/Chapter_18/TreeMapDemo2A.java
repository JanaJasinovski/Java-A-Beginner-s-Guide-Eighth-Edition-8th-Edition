package Chapter_18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class CompLastNames implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}

class CompThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

public class TreeMapDemo2A {
    public static void main(String[] args) {
        CompLastNames compLastNames = new CompLastNames();
        Comparator<String> comparator = compLastNames.thenComparing(new CompThenByFirstName());

        TreeMap<String, Double> tm = new TreeMap<>(comparator);

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
