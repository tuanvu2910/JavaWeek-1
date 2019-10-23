package Fan;

public class aFan {
      final int SLOW =1;
      final int MEDIUM =2;
      final int FAST =3;
    private int speed;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public aFan(boolean on ,double radius,String color){
        this.speed = SLOW;
        this.on = on;
        this.radius = radius;
        this.color = color;

    }


    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int SLOW) {
        this.speed = SLOW;
    }


    public void tostring(){
        if (this.on == true){
            System.out.println(speed);
            System.out.println(color);
            System.out.println(radius);
            System.out.println("Fan is on");
        }
        else {
            System.out.println(color);
            System.out.println(radius);
            System.out.println("Fan is off");

        }

    }



}
