package CircleAndCylinder;


public class Main {
    public static void main(String[] args) {
        Circle Circle1 = new Circle("yellow",4.5);
        System.out.println(Circle1);
        System.out.println(Circle1.getPerimeter());
        System.out.println(Circle1.getArea());
        Cylinder cylinder1 = new Cylinder("yellow",4.5,5);
        System.out.println(cylinder1);
        System.out.println(cylinder1.volume());

    }

}
