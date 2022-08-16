package Chapter_12;

enum Apple2{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple2 apple2;

        Apple2[] apple2s =Apple2.values();

        for(Apple2 apple21 : apple2s){
            System.out.println(apple21);
        }

        apple2 = Apple2.valueOf("Winesap");
        System.out.println(apple2);
    }
}
