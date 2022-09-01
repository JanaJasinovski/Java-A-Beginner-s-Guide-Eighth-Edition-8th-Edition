package Chapter_16;

class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}

public class toStringDemo {
    public static void main(String[] args) {
        Box box = new Box(10,12,14);
        String s = "Object box is " + box;

        System.out.println(box);
        System.out.println(s);
    }
}
