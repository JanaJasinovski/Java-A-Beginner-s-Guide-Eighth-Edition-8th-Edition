package Chapter_14;

class Gen2<T> {
    T ob;

    Gen2(T o){
        ob = o;
    }

    T getOb(){
        return ob;
    }
}

public class RawDemo {
    public static void main(String[] args) {
        Gen2<Integer> iob = new Gen2<>(88);
        Gen2<String> strob = new Gen2<>("test of message");
        //Gen2 raw = new Gen2(new Double(98.6));
//
//        double d = (Double) raw.getOb();
//
//        System.out.println(d);
//
//        strob = raw;
//
//        raw = iob;
    }
}
