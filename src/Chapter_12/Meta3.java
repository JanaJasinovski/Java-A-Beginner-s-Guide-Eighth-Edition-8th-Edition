package Chapter_12;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3{
    String str() default "Testing";
    int val() default 9000;
}

public class Meta3 {
    @MyAnno3()
    public static void myMeth(){
        Meta3 ob = new Meta3();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno3 anno3 = m.getAnnotation(MyAnno3.class);

            System.out.println(anno3.str() + " " + anno3.val());
        }catch (NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
