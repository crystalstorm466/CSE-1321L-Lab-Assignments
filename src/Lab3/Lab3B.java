/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 3
 */
package Lab3; //ignore this; this exists here as I organize my code into folders (packages) in intelliJ and GitHub.
import java.util.*;
public class Lab3B {
    public static void main(String[] args) {
        float courseOne;
        float courseTwo;
        float courseThree;
        float courseFour;
        float gradeOne;
        float gradeTwo;
        float gradeThree;
        float gradeFour;

        Scanner scan = new Scanner(System.in);
        System.out.print("Course 1 hours: ");
        courseOne = scan.nextFloat();
        System.out.print("Grade for course 1: ");
        gradeOne = scan.nextFloat();
        float qualityOne;
        qualityOne = courseOne*gradeOne;

        System.out.print("Course 2 hours: ");
        courseTwo = scan.nextFloat();
        System.out.print("Grade for course 2: ");
        gradeTwo = scan.nextFloat();
        float qualityTwo;
        qualityTwo = courseTwo*gradeTwo;

        System.out.print("Course 3 hours: ");
        courseThree = scan.nextFloat();
        System.out.print("Grade for course 3: ");
        gradeThree = scan.nextFloat();
        float qualityThree;
        qualityThree = courseThree*gradeThree;

        System.out.print("Course 4 hours: ");
        courseFour = scan.nextFloat();
        System.out.print("Grade for course 4: ");
        gradeFour = scan.nextFloat();
        float qualityFour;
        qualityFour = courseFour*gradeFour;

        float totalHours = courseOne+courseTwo+courseThree+courseFour;
        float totalQualityPoints = qualityOne+qualityTwo+qualityThree+qualityFour;

        System.out.println("Total hours is: " + totalHours);
        System.out.println("Total quality points is: " + totalQualityPoints);

        System.out.println("Your GPA for this semester is: " + totalQualityPoints/totalHours);


    }
}
