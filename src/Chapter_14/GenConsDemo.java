package Chapter_14;

class GenCons {
    private double val;

    <T extends Number> GenCons(T arg){
        val = arg.doubleValue();
    }

    void showval(){
        System.out.println(val);
    }
}

public class GenConsDemo{
    public static void main(String[] args) {
        GenCons test1 = new GenCons(100);
        GenCons test2 = new GenCons(123.5F);

        test1.showval();
        test2.showval();
    }
}