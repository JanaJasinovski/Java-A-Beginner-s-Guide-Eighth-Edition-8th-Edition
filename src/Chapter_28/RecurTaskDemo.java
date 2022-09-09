package Chapter_28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum2 extends RecursiveTask<Double> {
    final int seqThreshold = 500;
    double[] data;
    int start, end;

    public Sum2(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;
        if((end - start) < seqThreshold){
            for (int i = start; i < end; i++) sum += data[i];
        }else {
            int middle = (start + end) / 2;

            Sum2 sum2_1 = new Sum2(data, start, middle);
            Sum2 sum2_2 = new Sum2(data, middle, end);

            sum2_1.fork();
            sum2_2.fork();

            sum = sum2_1.join() + sum2_2.join();
        }
        return sum;
    }
}

public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        double[] nums = new double[5000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i : -i);

            Sum2 task = new Sum2(nums, 0, nums.length);

            double summation = fjp.invoke(task);
            System.out.println(summation);
        }
    }
}
