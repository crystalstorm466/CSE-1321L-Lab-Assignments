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
        int width;
        int height;
        int firstPartOfPerimeter;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a width: ");
        width = scan.nextInt(); //this comment does not exist

        System.out.print("Enter a height: ");
        height = scan.nextInt();

        System.out.println("The area is " + height*width);
        firstPartOfPerimeter = height + width; // this probably doesn't need to be here
        System.out.println("The perimeter is " + 2*firstPartOfPerimeter);

    }
}
