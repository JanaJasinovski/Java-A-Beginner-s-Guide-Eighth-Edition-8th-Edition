package Chapter_15;

interface MyFunc<T> {
    boolean func(T v1, T v2);
}

class HighTemp {
    private int hTemp;

    public HighTemp(int hTemp) {
        this.hTemp = hTemp;
    }

    boolean sameTemp(HighTemp highTemp){
        return hTemp == highTemp.hTemp;
    }

    boolean lessThanTemp(HighTemp highTemp){
        return hTemp < highTemp.hTemp;
    }
}

public class InstanceMethWithObjectRefDemo {
    static <T> int counter(T[] vals, MyFunc<T> f, T v){
        int count = 0;

        for (int i = 0; i < vals.length; i++) {
            if(f.func(vals[i], v)) count++;
         }

        return count;
    }

    public static void main(String[] args) {
        int count;

        HighTemp[] weekDayHighs = {
                new HighTemp(89), new HighTemp(82),
                new HighTemp(90), new HighTemp(89),
                new HighTemp(89), new HighTemp(91),
                new HighTemp(84), new HighTemp(83)
        };

        count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));

        System.out.println(count);

        HighTemp[] weekDayHighs2 = {
                new HighTemp(32), new HighTemp(12),
                new HighTemp(24), new HighTemp(19),
                new HighTemp(18), new HighTemp(12),
                new HighTemp(-1), new HighTemp(13)
        };

        count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(89));

        System.out.println(count);

        count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));

        System.out.println(count);

        count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));

        System.out.println(count);
    }
}
