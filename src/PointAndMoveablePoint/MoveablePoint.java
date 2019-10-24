package PointAndMoveablePoint;

import java.util.Arrays;

public class MoveablePoint extends Point {
    public float xSpeed , ySpeed;
    public float [] arrayspeed = new float[2];
    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;

    }
    public float[] getSpeed(){
        arrayspeed[0] = getxSpeed();
        arrayspeed[1] = getySpeed();
        return  arrayspeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", arrayspeed=" + Arrays.toString(arrayspeed) +
                ", x=" + x +
                ", y=" + y +
                ", array=" + Arrays.toString(array) +
                '}';
    }
    public MoveablePoint move(){
        x +=xSpeed;
        y +=ySpeed;
        return this;

    }
}
