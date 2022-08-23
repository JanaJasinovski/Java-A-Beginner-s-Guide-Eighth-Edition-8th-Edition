package Chapter_14;

class Stats<T extends Number> {
    T[] nums;

    public Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }

        return sum / nums.length;
    }

    boolean saveAvg(Stats<?> ob){
        if(average() == ob.average()){
            return true;
        }
        return false;
    }
}

public class BoundDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<>(inums);
        double v = iob.average();
        System.out.println(v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<>(dnums);
        double w = iob.average();
        System.out.println(w);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<>(fnums);
        double x = fob.average();
        System.out.println(x);

        if(iob.saveAvg(dob)){
            System.out.println("equals");
        }
        else {
            System.out.println("different");
        }

        if(iob.saveAvg(fob)){
            System.out.println("equals");
        }else {
            System.out.println("different");
        }
    }
}