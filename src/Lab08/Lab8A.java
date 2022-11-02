/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 8
 */
package Lab08;
import java.util.*;
public class Lab8A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] userArray1 = new int[5];
        int[] userArray2 = new int[5];
        System.out.print("Please enter 5 integers for the first array: ");
        for (int i = 1; i < 6; i++) {
            System.out.println("Integer " + i + ": ");
            userArray1[i] = scan.nextInt();

        }
        System.out.print("Please enter 5 integers for the first second: ");
        for (int c = 1; c < 6; c++) { //hey look its that other language
            System.out.println("Integer " + c + ": ");
            userArray2[c] = scan.nextInt();
        }
        int[] finalArray = new int[5];
        for (int i = 1; i < 5; i++) {
            finalArray[i] = userArray1[i] + userArray2[i];
        }
        System.out.println("The resulting sums are: " + Arrays.toString(finalArray));
    }
}
