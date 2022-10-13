/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 8
 */
package Lab8;
import java.util.*;
public class Lab8A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter 5 integers for the first array: ");
        int [] firstArray = new int[6];
        int [] secondArray = new int[6];
        int [] sumArray = new int [5];
        for (int a = 1; a <= 5; a++) {
            System.out.print("Integer " + a +": ");
            firstArray [a] = scan.nextInt();
        }
        System.out.println("Please enter 5 integers for the second array: ");
        for (int b = 1; b <= 5; b++) {
            System.out.print("Integer " + b +": ");
            secondArray[b] = scan.nextInt();

        }
        for (int c = 1; c <= 5; c++) {
            sumArray[c-1] = firstArray[c] + secondArray[c];
        }
        System.out.println("The resulting sums are " + Arrays.toString(sumArray));
    }
}
