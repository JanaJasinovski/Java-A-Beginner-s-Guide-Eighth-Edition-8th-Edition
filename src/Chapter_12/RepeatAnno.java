package Chapter_12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno6{
    String str() default "Testing";
    int val() default 9000;
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos{
    MyAnno6[] value();
}

public class RepeatAnno {

    @MyAnno6(str = "First annotation", val = -1)
    @MyAnno6(str = "Second annotation", val = 100)

    public static void myMeth(String str, int i){
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation annotation = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(annotation);
        }catch (NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
