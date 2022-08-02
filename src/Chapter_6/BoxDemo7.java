package Chapter_6;

class Box7{
    double width;
    double height;
    double depth;

    public Box7(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    double volume(){
        return width * height * depth;
    }
}
public class BoxDemo7 {
    public static void main(String[] args) {
        Box7 mybox1 = new Box7(10, 20, 15);
        Box7 mybox2 = new Box7(3,6,9);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume: " + vol);
    }
}