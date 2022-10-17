/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 10
 */
package Lab10;
import java.util.*;
public class Lab10B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean mainLoop = true;
        while (mainLoop) {
            System.out.print("Enter width: ");
            double userWidth = scan.nextDouble();
            System.out.print("Enter height: ");
            double userHeight = scan.nextDouble();
            if (isValid(userWidth, userHeight)) {
                System.out.println("This is a valid rectangle");
                mainLoop = false;
                System.out.println("The area is: " + area(userWidth, userHeight));
                System.out.println("The perimeter is: " + perimeter(userWidth, userHeight));
                break;
            } else {
                System.out.println("This is an invalid rectangle");
                System.out.println(" ");
                System.out.print("Do you want to enter another width and height (Y/N)? : ");
                char userAgain = scan.next().charAt(0);
                if (userAgain == 'Y' || userAgain == 'y') {
                    //continue
                } else if (userAgain == 'N' || userAgain == 'n') {
                    mainLoop = false;
                    break;
                }
            }
        }
    }

    public static boolean isValid(double width, double height) {
        if (width + height >= 30) {
            return true;
        }
        return false;
    }
    
    public static double area (double width, double height) {
        return (width * height);
    }

    public static double perimeter (double width, double height) {
        return (2 * (width + height));
    }
}
