package Lab5;
import java.util.*;

public class Lab5C {
    public static void main(String[] args) {
        int userX;
        int userY;
        String placeX;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter x:");
        userX = scan.nextInt();
        System.out.print("Enter y:");
        userY = scan.nextInt();

        if ((userX == 0) && (userY == 0)) {
            System.out.println("This point is the origin.");
        } else if (userX == 0 ) {
            System.out.println("This point is on the y-axis.");
        }  else if (userY == 0) {
            System.out.println("This point is on the x-axis.");
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
