/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 7
 */
package Lab07;
import java.util.*;
public class Lab7A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a value for the size: ");
        int boxSize = scan.nextInt();
        int i;
        System.out.println("This is the requested " + boxSize + "x" + boxSize + " box:");
        for (i = 0; i <= boxSize-1;i++) {
            for(int line = 0; line <= boxSize-2; line++) {
                System.out.print("*");
            }
            System.out.println("*");
        }


    }
}
