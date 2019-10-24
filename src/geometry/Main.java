package geometry;

public class Main {
    public static void main(String[] args) {
         Shape aShape = new Shape();
        System.out.println(aShape);
        aShape = new Shape("red",false);
        System.out.println(aShape);
        Circle circle = new Circle();
        System.out.println(circle);
        circle = new Circle(3.5);
        System.out.println(circle);
        circle = new Circle("indigo", false, 3.5);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);
        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);
        Square square = new Square();
        System.out.println(square);
        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8, "yellow", true);
        System.out.println(square);

    }
}
