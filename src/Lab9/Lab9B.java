/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 9
 */
package Lab9;
import java.util.*;
public class Lab9B {
    public static void main(String[] args) {
        int [] bubbleArray = new int [11];
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 11 numbers:");
        for (int i = 0; i < bubbleArray.length; i++) {
            System.out.print("Integer " + i + ": ");
            bubbleArray[i] = scan.nextInt();
        }
        System.out.print("What is the target number: ");
        int target = scan.nextInt();

        int low = 0;
        int high = bubbleArray.length-1;
        int mid = 0;
        boolean isTarget = false;


        for (int c = 0; c < bubbleArray.length-1; c++) {
            for (int d = 0; d < bubbleArray.length-c-1; d++) {
                if (bubbleArray[d] > bubbleArray[d+1]) {
                    int newValue = bubbleArray[d];
                        bubbleArray[d] = bubbleArray[d+1];
                        bubbleArray[d+1] = newValue;
                }
            }
        }
        System.out.println("The sorted set: " + Arrays.toString(bubbleArray));

        while (high >= low) {
            mid = (low + high) / 2;
            if (target < bubbleArray[mid]) {
                high = mid - 1;
            } else if (target == bubbleArray[mid]) {
                isTarget = true;
                System.out.println("The target is in the set.");
                break;
            } else low = mid + 1;
            System.out.println("Low is " + low);
            System.out.println(" ");
            System.out.println("High is " + high);
            System.out.println(" ");
            System.out.println("Mid is " + mid);
            System.out.println(" ");
            System.out.println("Searching");
        }
        if (!isTarget) {
            System.out.println("The target is not in the set.");
        }
    }
}