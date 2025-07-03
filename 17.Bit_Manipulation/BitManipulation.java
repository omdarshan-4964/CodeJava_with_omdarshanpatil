
public class BitManipulation {
    public static void main(String args[]) {
        System.out.println((5 & 6)); // Binary AND (4)
        System.out.println((10 & -3)); // 8

        System.out.println((5 | 6)); // Binary OR (7)

        System.out.println((5 ^ 6)); // Binary XOR (3)

        System.out.println((~5)); // 1's Compliment (-6)
        System.out.println((~0)); // (-1)

        System.out.println((5 << 2)); // Binary Left Shift (20)

        System.out.println((5 >> 2)); // Binary Right Shift (1)
        System.out.println((6 >> 1)); // (3)

        
    }
}

