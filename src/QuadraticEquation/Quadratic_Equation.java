package QuadraticEquation;

public class Quadratic_Equation {
   private double a,b,c;
   private Quadratic_Equation(){};
   public Quadratic_Equation(double a,double b, double c){
       this.a = a;
       this.b = b;
       this.c = c;
   };
   public double  getDiscriminant(){
       return  this.b*2 - 4*this.a*this.c;
   }
   public double getRoot1(){
       return (-this.b + Math.sqrt((Math.pow(this.b,2))-4*this.a*this.c))/2*this.a;
   }
   public double getRoot2(){
       return (-this.b + Math.sqrt((Math.pow(this.b,2))+4*this.a*this.c))/2*this.a;
   }
   public void Coculator(){
       if (getDiscriminant() >= 0){
           System.out.println(getRoot1());
           System.out.println(getRoot2());

       }else {
           System.out.println(getRoot1());
       }
   }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
