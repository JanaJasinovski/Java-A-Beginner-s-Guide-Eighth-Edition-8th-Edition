package Chapter_7;


class A4 {
    int i, j;

    public A4(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void show() {
        System.out.println(i + " " + j);
    }
}

class B4 extends A4 {

    int k;

    public B4(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void show() {
        System.out.println(k);
    }
}

public class Override {
    public static void main(String[] args) {
        B4 subOb = new B4(1, 2, 3);
        subOb.show();
    }

}
