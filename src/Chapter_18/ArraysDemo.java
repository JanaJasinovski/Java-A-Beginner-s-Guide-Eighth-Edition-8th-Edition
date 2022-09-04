package Chapter_18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        display(array);
        Arrays.sort(array);
        display(array);

        Arrays.fill(array, 2, 6, -1);
        display(array);

        Arrays.sort(array);
        display(array);

        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int[] array){
        for(int i: array){
            System.out.println(i + " ");
        }
    }
}
