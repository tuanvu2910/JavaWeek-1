package PointAndMoveablePoint;

import java.util.Arrays;

public class Point {
    public float x,y;
    public float [] array = new float[2];

    public Point() {
    }

    public Point(float x, float y) {
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
    public float[] getXY(){
        array[0] = getX();
        array[1] = getY();
        return array;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
