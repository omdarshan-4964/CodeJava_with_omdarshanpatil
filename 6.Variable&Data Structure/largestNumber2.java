import java.util.Scanner;

public class largestNumber2 {
    public static void main(String argc[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter value of a:");
        int a = sc.nextInt();
        
        System.out.println(" value of b:");
        int b = sc.nextInt();
        
        System.out.println("er value of c:");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Largest number = " + a);
            } else {
                System.out.println("Largest number = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Largest number = " + b);
            } else {
                System.out.println("Largest number = " + c);
            }
        }

    }
}
