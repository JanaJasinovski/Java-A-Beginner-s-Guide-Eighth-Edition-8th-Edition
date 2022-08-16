package Chapter_12;

enum Apple4{
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

public class EnumDemo4 {
    public static void main(String[] args) {
        Apple4 apple4, apple41, apple42;

        for(Apple4 a: Apple4.values()){
            System.out.println(a + " " + a.ordinal());
        }

        apple4 = Apple4.RedDel;
        apple41 = Apple4.GoldenDel;
        apple42 = Apple4.RedDel;

        if(apple4.compareTo(apple41) < 0){
            System.out.println(apple4 + " " + apple41);
        }

        if(apple4.compareTo(apple41) > 0){
            System.out.println(apple41 + " " + apple4);
        }

        if(apple4.compareTo(apple42) == 0){
            System.out.println(apple4 + " " + apple42);
        }

        if(apple4.equals(apple41)){
            System.out.println(apple4 + " " + apple41);
        }

        if(apple4.equals(apple41)){
            System.out.println(apple41 + " " + apple4);
        }

        if(apple4.equals(apple42)){
            System.out.println(apple4 + " " + apple42);
        }
    }
}
