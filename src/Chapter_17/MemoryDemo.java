package Chapter_17;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someints = new Integer[1000];
        System.out.println(r.totalMemory());

        mem1 = r.freeMemory();
        System.out.println(mem1);

        r.gc();
        mem1 = r.freeMemory();
        System.out.println(mem1);

        for (int i = 0; i < 1000; i++) {
            someints[i] = i;
        }

        mem2 = r.freeMemory();
        System.out.println(mem2);

        System.out.println(mem1-mem2);

        for (int i = 0; i < 1000; i++) {
            someints[i] = null;
        }

        r.gc();
        mem2 = r.freeMemory();
        System.out.println(mem2);
    }
}
