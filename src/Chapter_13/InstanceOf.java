package Chapter_13;

class A {
    int i, j;
}

class B {
    int i, j;
}

class C extends A {
    int k;
}

class D extends A {
    int k;
}

public class InstanceOf {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if(a instanceof A){
            System.out.println("a is an object of class A");
        }
        if(b instanceof B){
            System.out.println("b is an object of class B");
        }
        if(c instanceof C){
            System.out.println("c is an object of class C");
        }
        if(c instanceof A){
            System.out.println("c is an object of class A");
        }
        if(a instanceof C){
            System.out.println("a is an object of class C");
        }

        System.out.println();
        A ob;
        ob = d;
        if(ob instanceof D){
            System.out.println("ob is an object of class D");
        }

        ob = c;

        if(ob instanceof D){
            System.out.println("a is an object of class A");
        } else System.out.println("no");

        if(ob instanceof A){
            System.out.println("a is an object of class A");
        }

        if (a instanceof Object){
            System.out.println("a is Object");
        }
        if (b instanceof Object){
            System.out.println("b is Object");
        }
        if (c instanceof Object){
            System.out.println("c is Object");
        }
        if (d instanceof Object){
            System.out.println("d is Object");
        }
    }
}
