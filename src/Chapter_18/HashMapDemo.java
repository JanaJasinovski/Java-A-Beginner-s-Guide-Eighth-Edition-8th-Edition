package Chapter_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Double> hm = new HashMap<>();

        hm.put("John Dou",3434.34);
        hm.put("Tom Smit", 123.22);
        hm.put("Jain Baker", 1378.00);
        hm.put("Tod Holl", 99.22);
        hm.put("Ralf Smit", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me: set){
            System.out.println(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = hm.get("John Dou");
        hm.put("John Dou", balance + 1000);
        System.out.println(hm.get("John Dou"));
    }
}
