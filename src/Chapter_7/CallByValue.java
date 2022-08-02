package Chapter_7;

class Test2 {
    int a, b;

    public Test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Test2() {
    }

    public Test2(int a) {
        this.a = a;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test2 o){
        o.a *= 2;
        o.b /= 2;
    }

    Test2 incrByTen(){
        Test2 test2 = new Test2(a + 10);

        return test2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;
        ob.meth(a, b);
        System.out.println(a + " " + b);

        Test2 ob2 = new Test2(15,20);
        ob2.meth(ob2);
        System.out.println(ob2.a + " " + ob2.b);

        Test2 ob3 = new Test2(2);
        Test2 ob4;
        ob4 = ob3.incrByTen();
        System.out.println(ob3.a);
        System.out.println(ob4.a);
    }
}
