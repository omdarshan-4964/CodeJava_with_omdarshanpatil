import java.util.*;

public class evenOdd {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();
            
            if (number % 2 == 0) {
                System.out.println("The number is Even");
            } else {
                System.out.println("The number is Odd");
            }
        }
    }
}
