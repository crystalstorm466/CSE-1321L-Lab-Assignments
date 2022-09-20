/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 7
 */
package Lab7;
import java.util.*;
public class Lab7B {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int boxSize = scan.nextInt();
        int i;
        System.out.println("This is the requested " + boxSize + "x" + boxSize + " right-triangle:");
        for (i = 0; i < boxSize;i++) {
            for(int line = 0; line <= i; line++) {
                System.out.print("* ");
                }
            System.out.println();
        }


    }
}
