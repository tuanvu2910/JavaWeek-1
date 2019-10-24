package Point2dPoint3D;

public class Main {
    public static void main(String[] args) {
       Point2D point2D = new Point2D(1.1f,1.2f);
        System.out.println(point2D);
        point2D.getXY();
        point2D.displayXY();
        Point3D point3D = new Point3D(1.5f,2.8f,9f);
        System.out.println(point3D);
        point3D.getXYZ();
        point3D.diplayXYZ();
    }
}
