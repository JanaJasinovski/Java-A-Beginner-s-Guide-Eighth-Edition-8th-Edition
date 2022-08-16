package Chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle{
  int value();
}

public class Single {
    @MySingle(100)
    public static void myMeth(){
        Single ob = new Single();

        try {
            Method m = ob.getClass().getMethod("myMeth");
            MySingle anno = m.getAnnotation(MySingle.class);
            System.out.println(anno.value());
        }catch (NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
