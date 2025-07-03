/* Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */

 import java.util.*;

public class totalCost {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        System.out.println("The cost of pencil = " + pencil);
        System.out.println("The cost of pen = " + pen);
        System.out.println("The cost of eraser = " + eraser);

        float cost = pencil + pen + eraser;
        System.out.println("The total cost is: " + cost);

        float gst = cost * 0.18f;

        float totalCost = cost + gst;

        System.out.println("The total cost including GST is: " + totalCost);

    }
}

/*
 Output: 
 10 20 30
The cost of pencil = 10.0
The cost of pen = 20.0
The cost of eraser = 30.0
The total cost including GST is: 70.8 
 */
