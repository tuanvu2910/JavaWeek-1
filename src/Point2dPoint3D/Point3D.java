package Point2dPoint3D;

import java.util.Arrays;

public class Point3D extends Point2D{
    private float z ;

    public Point3D(float z) {
        this.z = z;
    }
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    private float getZ() {
        return z;
    }

    private void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y,float z) {
        super.setXY(x, y);
        setZ(z);
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public float[] getXYZ(){
        super.getXY();
        Array[2] = getZ();
       return Array;
    }
    public void diplayXYZ(){
        super.displayXY();
        System.out.println(Array[2]);
    }

}
