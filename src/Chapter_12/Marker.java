package Chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}

public class Marker {
    @MyMarker
    public static void myMeth(){
        Marker ob = new Marker();

        try {
            Method m = ob.getClass().getMethod("myMeth");

            if(m.isAnnotationPresent(MyMarker.class))
                System.out.println("Annotation-marker MyMarker is present");
        }catch (NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
