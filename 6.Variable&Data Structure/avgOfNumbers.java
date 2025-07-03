import java.util.*;

public class avgOfNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        float  ans = (A + B + C)/ 3;
        System.out.println(ans);

    }
}

/*
 * Output:
 * 10 20 30
20.0
 */