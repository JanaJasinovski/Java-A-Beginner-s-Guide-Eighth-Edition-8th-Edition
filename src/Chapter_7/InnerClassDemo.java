package Chapter_7;

class Outer2{
    int outer_x = 100;

    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner{
                void display(){
                    System.out.println(outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}
public class InnerClassDemo {
    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.test();
    }
}
