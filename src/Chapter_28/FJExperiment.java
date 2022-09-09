package Chapter_28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.jar.JarEntry;

class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start, end;

    public Transform(double[] data, int seqThreshold, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = seqThreshold; i < end; i++) {
                if ((data[i] % 2) == 0)
                    data[i] = Math.sqrt(data[i]);
                else data[i] = Math.cbrt(data[i]);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new Transform(data, start, middle, seqThreshold),
                    new Transform(data, middle, end, seqThreshold));
        }
    }
}

public class FJExperiment {
    public static void main(String[] args) {
        int pLevel;
        int threshold;

        if (args.length != 2) {
            System.out.println("FJExperiment");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        long beginT, endT;
        ForkJoinPool fjp = new ForkJoinPool(pLevel);
        double[] nums = new double[100_000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0, nums.length, threshold);
        beginT = System.nanoTime();

        fjp.invoke(task);
        endT = System.nanoTime();

        System.out.println(pLevel);
        System.out.println(threshold);
        System.out.println((endT - beginT));
    }
}
