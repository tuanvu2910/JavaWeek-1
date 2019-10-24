package geometry;

public class Circle extends Shape {
    private double PI = 3.14;
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
   public Circle(){

   }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.pow(radius,2)* this.PI;
    }
    public  double getPerimeter(){
        return 2*radius*this.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+getRadius()+", which is a subclass of "+super.toString();
    }

}
