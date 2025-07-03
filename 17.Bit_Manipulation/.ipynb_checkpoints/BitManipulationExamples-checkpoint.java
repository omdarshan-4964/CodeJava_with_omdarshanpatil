public class BitManipulationExamples {
    public static void evenOrOdd (int number) {
        int BitMask = 1;
        if ((number & BitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }

    public static int getIthBit(int number, int i) {
        int BitMask = 1<<i;

        if((number & BitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int number, int i) {
        int BitMask = 1<<i;
        return number | BitMask;
    }

    public static int clearIthBit(int number, int i) {
        int BitMask = ~(1<<i);
        return (number & BitMask);
    }

    public static void main(String[] args) {

        // Even or Odd
        evenOrOdd(7);
        evenOrOdd(4);
        evenOrOdd(10);

        System.out.println();
        System.out.println();
        
        // getIth Bit
        System.out.println(getIthBit(10, 2));
        System.out.println(getIthBit(7, 0));
        System.out.println(getIthBit(4, 0));

        System.out.println();
        System.out.println();

        // setIth Bit
        System.out.println(setIthBit(10, 0));

        System.out.println();
        System.out.println();

        // clearIthBit

        System.out.println(clearIthBit(10, 0));
        System.out.println(setIthBit(10, 0));


    }
}
