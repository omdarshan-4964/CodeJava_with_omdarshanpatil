

public class largestNumber {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        int c = 30;

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
