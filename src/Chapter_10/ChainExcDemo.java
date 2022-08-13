package Chapter_10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("top level");
        e.initCause(new ArithmeticException("why"));
        throw e;
    }

    public static void main(String[] args) {
        try {
            demoproc();
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
