import javax.swing.tree.FixedHeightLayoutCache;
import java.util.Scanner;

public class RectangleProgram {
    public static void main(String[]args){
      float Width ;
      float Height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width:");
        Width = scanner.nextFloat();
        System.out.println("Enter Height");
        Height = scanner.nextFloat();
        float area = Width*Height;
        System.out.println("Area is: "+area);
    }
}
