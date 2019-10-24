package Point2dPoint3D;


public class Point2D {
    public float x,y;
    public float[]Array = new float[3];

    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public float[] getXY(){
        Array[0] = getX();
        Array[1] = getY();
        return Array ;

    }
    public void displayXY(){
        for (int i =0;i<Array.length;i++){
            if (Array[i]!= 0.0f) {
                System.out.println(Array[i]);
            }
        }
    }
}
