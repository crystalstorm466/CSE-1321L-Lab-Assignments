/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 2
 */
import java.util.*;

public class Lab2C {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        double firstPartOfPerimeter;

        System.out.println("[CSE-1321L: Lab 2C]");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = scan.nextDouble();

        scan = new Scanner(System.in);
        System.out.print("Enter a height: ");
        height = scan.nextDouble();

        System.out.println("The area is " + height*width);
        firstPartOfPerimeter = height + width;
        System.out.println("The perimeter is " + 2*firstPartOfPerimeter);

    }
}
