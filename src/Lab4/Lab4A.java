/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 4
 */
package Lab4;
import java.util.*;

public class Lab4A {
    public static void main(String[] args) {

        float userGrade;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the score on your exam: ");
        userGrade = userInput.nextFloat();

        if (userGrade >= 98) {
            System.out.println("Letter Grade is: A+");
        }
        else if (userGrade >= 95) {
            System.out.println("Letter Grade is: A");
        } else if (userGrade >= 92) {
            System.out.println("Letter Grade is A-");
        } else if (userGrade >= 89) {
            System.out.println("Letter Grade is B+");
        } else if (userGrade >= 86) {
            System.out.println("Letter Grade is B");
        } else if (userGrade >= 83) {
            System.out.println("Letter Grade is B-");
        } else if (userGrade >= 80) {
            System.out.println("Letter Grade is C+");
        } else if (userGrade >= 77) {
            System.out.println("Letter Grade is C");
        } else if (userGrade >= 74) {
            System.out.println("Letter Grade is C-");
        } else if (userGrade >= 71) {
            System.out.println("Letter Grade is D+");
        } else if (userGrade >= 68) {
            System.out.println("Letter Grade is D");
        } else if (userGrade >= 65) {
            System.out.println("Letter Grade is D-");
        } else if (userGrade >= 0) {
            System.out.println("Letter Grade is F");
        }

    }
}
