
import java.util.*;

public class larrgestNumber {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if (A > B){
                if (A > C) {
                    System.out.println(A + " is greater");
                } else {
                    System.out.println(C + " is greater");
                }
            } else {
                if (B > C) {
                    System.out.println(B + " is greater");
                } else {
                    System.out.println(C + " is greater");
                }
            }
        } 
    }
}
