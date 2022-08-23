package Chapter_14;

class Gen10<T>{
    T ob;

    public Gen10(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class Gen11 extends Gen10<String>{

    public Gen11(String ob) {
        super(ob);
    }
    @Override
    public String getOb(){
        System.out.println();
        return ob;
    }
}

public class BridgeDemo {
    public static void main(String[] args) {
        Gen11 strob2 = new Gen11("Text of message");
        System.out.println(strob2.getOb());
    }
}
