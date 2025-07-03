import  java.util.*;
public class positiveNegative {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int number = sc.nextInt();

             if (number > 0) {
                System.out.println("The number is Positive.");
             } else {
                System.out.println("The number is Negative");
             }
        }

    }
}
