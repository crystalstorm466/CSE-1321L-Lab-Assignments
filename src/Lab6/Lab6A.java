/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 6
 */
package Lab6;
import java.util.*;

public class Lab6A {
    public static void main(String[] args) {
        int userInt = 0;
        int maxInt = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            if (userInt > maxInt) {
                maxInt = userInt;
            }
            System.out.print("Please enter number " + i + ": ");
            userInt = scan.nextInt();


        }
        System.out.println("The largest number was " + maxInt);
    }
}
