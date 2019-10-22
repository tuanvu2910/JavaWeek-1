import java.util.Scanner;

public class phuongTrinhbac1 {
    public static void main(String[] args) {
             System.out.println("Linear Equation Resolver");
             System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");
             Scanner ptBac2 = new Scanner(System.in);
             System.out.println("a = ?");
             double x = ptBac2.nextDouble();
             System.out.println("b = ?");
             double y = ptBac2.nextDouble();
             System.out.println("c = ?");
             double z = ptBac2.nextDouble();
             if (x !=0){
                 double solution = -y/x;
                 System.out.printf("The solution is: %f!", solution);
             } else if(y ==0){
                 System.out.println("The solution is all x!");

             } else {
                 System.out.print("No solution!");
             }

               }
    }

