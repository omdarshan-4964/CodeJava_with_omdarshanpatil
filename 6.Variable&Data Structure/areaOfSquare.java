
import java.util.Scanner;

public class areaOfSquare {
   public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      int side = sc.nextInt();
       int area = side * side;

       System.out.println("The area of Square is : " + area);
   }

   } 
}
