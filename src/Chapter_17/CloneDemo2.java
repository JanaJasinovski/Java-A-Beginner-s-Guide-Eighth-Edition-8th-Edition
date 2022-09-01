package Chapter_17;

class TestClone2 implements Cloneable {
    int a;
    double b;

    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            System.out.println("Clone is not possible");
            return this;
        }
    }
}

public class CloneDemo2 {
    public static void main(String[] args) {
        TestClone2 x1 = new TestClone2();
        TestClone2 x2;
        x1.a = 10;
        x1.b = 20.98;

        x2 = (TestClone2) x1.clone();

        System.out.println(x1.a + " " + x1.b);
        System.out.println(x2.a + " " + x2.b);
    }
}
