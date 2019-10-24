package geometry;

public class Rectangle extends Shape {
    double width , lenght;
    public Rectangle(){

    }
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return "A Rectangle with width="+ getWidth() +"and length="+getLenght()+", which is a subclass of "+super.toString();
    }

    public double getAreea(){
        return width*lenght;
    }
    public double getPerimeter(){
        return width*2+lenght*2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
}
