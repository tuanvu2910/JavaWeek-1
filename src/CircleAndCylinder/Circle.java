package CircleAndCylinder;

public class Circle {
    private double PI = 3.14;
    public String color;
    public double radius;

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "color='" + color + '\'' +
                ", radius=" + radius +
                '}';
    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)* this.PI;
    }
    public  double getPerimeter(){
        return 2*radius*this.PI;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


}
