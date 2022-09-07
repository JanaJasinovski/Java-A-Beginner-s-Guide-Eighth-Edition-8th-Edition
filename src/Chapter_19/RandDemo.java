package Chapter_19;

import java.util.Random;

public class RandDemo {
    public static void main(String[] args) {
        Random r = new Random();
        double val;
        double sum = 0;
        int[] bell = new int[10];

        for (int i = 0; i < 100; i++) {
            val = r.nextGaussian();
            sum += val;
            double t = -2;

            for (int j = 0; j < 10; j++, t += 0.5) {
                if(val < t){
                    bell[j]++;
                    break;
                }
            }
        }

        System.out.println(sum/100);

        for (int j = 0; j < 10; j++) {
            for (int k = bell[j]; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
