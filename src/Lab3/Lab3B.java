/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 3
 */
package Lab3;
import java.util.*;
import java.text.DecimalFormat;

public class Lab3B {
    public static void main(String[] args) {
        float courseOne, courseTwo, courseThree, courseFour; // didn't put course and grade together as I wanted to organize
        float gradeOne, gradeTwo, gradeThree, gradeFour;

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
        DecimalFormat roundTotalQualityPoints = new DecimalFormat("#.#####");
        float totalHours = courseOne+courseTwo+courseThree+courseFour;
        float totalQualityPoints = qualityOne+qualityTwo+qualityThree+qualityFour;

        System.out.println("Total hours is: " + totalHours);
        System.out.println("Total quality points is: " + totalQualityPoints);

        System.out.println("Your GPA for this semester is: " + roundTotalQualityPoints.format(totalQualityPoints/totalHours));


    }
}
