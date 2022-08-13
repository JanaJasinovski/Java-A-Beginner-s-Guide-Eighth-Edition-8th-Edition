package Chapter_11;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println(thread);

        thread.setName("My Thread");
        System.out.println(thread);

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
