package Chapter_30;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class RefletctionDemo1 {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            Constructor[] constructor = c.getConstructors();
            for (Constructor value : constructor) {
                System.out.println(value);
            }

            Field[] fields = c.getFields();
            for (Field field : fields) {
                System.out.println(field);
            }

            Method[] methods = c.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
