package Chapter_6;

class Box6{
    double width;
    double height;
    double depth;

    public Box6() {
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }

    double volume(){
        return width * height * depth;
    }
}
public class Box6Demo {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume: " + vol);

        vol = mybox2.volume();
        System.out.println("Volume: " + vol);
    }
}
