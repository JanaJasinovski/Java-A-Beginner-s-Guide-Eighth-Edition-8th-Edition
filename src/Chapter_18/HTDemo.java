package Chapter_18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HTDemo {
    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();
        Enumeration<String> names;
        String str;
        double bal;

        balance.put("John Dou",3434.34);
        balance.put("Tom Smit", 123.22);
        balance.put("Jain Baker", 1378.00);
        balance.put("Tod Holl", 99.22);
        balance.put("Ralf Smit", -19.08);

        names = balance.keys();

        while (names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("John Dou");
        balance.put("John Dou", bal + 1000);
        System.out.println(balance.get("John Dou"));
    }
}
