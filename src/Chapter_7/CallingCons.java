package Chapter_7;

class A2{
    A2(){
        System.out.println("A2");
    }
}

class B2 extends A2{
    B2(){
        System.out.println("B2");
    }
}

class C2 extends B2{
    C2(){
        System.out.println("C2");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C2 c2 = new C2();
    }
}
