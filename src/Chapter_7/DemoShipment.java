package Chapter_7;

class Box3{
    private double width;
    private double height;
    private double depth;

    Box3(Box3 ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;
    }

    public Box3(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box3() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box3(double len){
        width = height = depth = len;
    }

    double volume(){
        return width * height * depth;
    }
}

class BoxWeight extends Box3{
    double weight;

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

    public BoxWeight(double width, double height, double depth, double weight) {
        super(width, height, depth);
        this.weight = weight;
    }

    BoxWeight(){
        super();
        weight = -1;
    }

    BoxWeight(double len, double m){
        super(len);
        weight = m;
    }
}

class Shipment extends BoxWeight{
    double cost;

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }

    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        cost = c;
    }

    Shipment(){
        super();
        cost = -1;
    }

    Shipment(double len, double m, double c){
        super(len, m);
        cost = c;
    }
}
public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;

        vol = shipment1.volume();
        System.out.println(vol);
        System.out.println(shipment1.weight);
        System.out.println(shipment1.cost);

        vol = shipment2.volume();
        System.out.println(vol);
        System.out.println(shipment2.weight);
        System.out.println(shipment2.cost);
    }
}
