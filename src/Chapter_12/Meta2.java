package Chapter_12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Myanno{
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What{
    String description();
}

@What(description = "Annotation for text class")
@Myanno(str = "Meta2", val = 99)
public class Meta2 {
    @What(description = "Annotation for text method")
    @Myanno(str = "Testing", val = 100)
    public static void myMeth(){
        Meta2 ob = new Meta2();

        try {
            Annotation[] annotations = ob.getClass().getAnnotations();

            for (Annotation a: annotations){
                System.out.println(a);
            }
            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");
            annotations = m.getAnnotations();

            for (Annotation a: annotations){
                System.out.println(a);
            }
        }catch (NoSuchMethodException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
