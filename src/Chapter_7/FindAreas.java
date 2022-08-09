package Chapter_7;

class Figure{
    double dim1;
    double dim2;

    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area(){
        System.out.println("not determine");
        return 0;
    }
}

class Rectangle extends Figure{

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area(){
        return dim1 * dim2;
    }
}

class Triangle extends Figure{

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area(){
        return dim1 * dim2 / 2;
    }
}

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);

        Figure figure1;
        figure1 = rectangle;
        System.out.println(figure1.area());

        figure1 = triangle;
        System.out.println(figure1.area());

        figure1 = figure;
        System.out.println(figure1.area());
    }
}
