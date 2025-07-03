import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter something: ");
            String input = sc.nextLine();
            System.out.println("You entered: " + input);
        }
    }
}
