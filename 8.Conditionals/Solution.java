import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();  // Read the input number
            
            for (int i = 1; i <= 10; i++) {
                int result = N * i;
                System.out.println(N + " x " + i + " = " + result);
            }
        } // Read the input number
    }
}
