/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 5
 */
package Lab05;
import java.util.*;

public class Lab5C {
    public static void main(String[] args) {
        String placeX;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x:");
        int userX = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter y:");
        int userY = scan.nextInt();
        scan.nextLine();

        if ((userX == 0) && (userY == 0)) {
            System.out.println("This point is the origin.");
        } else if (userX == 0) {
            System.out.println("This point is on the y axis.");
        }  else if (userY == 0) {
            System.out.println("This point is on the x axis.");
        } else if ((userX >= 1) && (userY >= 1)) {
            System.out.println("This point is in the first quadrant.");
        } else if ((userX <=1) && (userY >=1)) {
            System.out.println("This point is in the second quadrant.");
        } else if ((userX <=1) && (userY <=1)) {
            System.out.println("This point is in the third quadrant.");
        } else if ((userX >=1) && (userY <=1)) {
            System.out.println("This point is in the fourth quadrant.");
        }
    }
}
