package Chapter_12;

enum Apple{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo {
    public static void main(String[] args) {
        Apple apple;
        apple = Apple.RedDel;
        System.out.println("Value of apple: " + apple);
        System.out.println();

        apple =  Apple.GoldenDel;

        if(apple == Apple.Cortland){
            System.out.println("Variable apple contains GoldenDel.\n");
        }

        switch (apple){
            case Jonathan: System.out.println("Jonathan"); break;
            case GoldenDel:
                System.out.println("GoldenDel");
                break;
            case RedDel:
                System.out.println("RedDel");
                break;
            case Winesap:
                System.out.println("Winesap");
                break;
            case Cortland:
                System.out.println("Cortland");
                break;
        }
    }
}
