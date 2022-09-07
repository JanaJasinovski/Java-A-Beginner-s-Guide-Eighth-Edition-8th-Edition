package Chapter_19;

import java.util.Locale;
import java.util.ResourceBundle;

public class LRBDemo {
    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("SampleRB");

        System.out.println(resourceBundle.getString("title"));
        System.out.println(resourceBundle.getString("StopText"));
        System.out.println(resourceBundle.getString("StartText"));

        resourceBundle = ResourceBundle.getBundle("SampleRB", Locale.GERMAN);

        System.out.println(resourceBundle.getString("title"));
        System.out.println(resourceBundle.getString("StopText"));
        System.out.println(resourceBundle.getString("StartText"));
    }
}
