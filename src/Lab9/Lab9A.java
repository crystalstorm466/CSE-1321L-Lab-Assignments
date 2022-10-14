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
public class Lab9A {
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers:");
        Scanner scan = new Scanner(System.in);
        int [] binaryArray = new int [11];
        for (int i = 1; i < binaryArray.length; i++) {
            System.out.print("Integer " + i + ": ");
            binaryArray[i] = scan.nextInt();
        }
        System.out.print("What is the target number: ");
        int target = scan.nextInt();
        boolean isTarget = false;
        for (int j = 0; j < binaryArray.length; j++) {
            if (binaryArray[j] == target) {
                isTarget = true;
                System.out.println("The target is in the set.");
                break;
            }
        }
        if (!isTarget) {
            System.out.println("The target number is not in the set.");
        }

    }
}
