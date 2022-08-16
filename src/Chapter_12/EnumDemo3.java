package Chapter_12;

enum Apple3{
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);

    private int price;

    Apple3(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 apple3;

        for(Apple3 apple31: Apple3.values()){
            System.out.println(apple31.getPrice());
        }
    }
}
