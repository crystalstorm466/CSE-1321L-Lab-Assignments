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
public class Lab4C {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner scan = new Scanner(System.in);
        float userNumber;
        System.out.print("Please input a number: ");
        userNumber = scan.nextFloat();
        int userChoice;
        System.out.println("What would you like to do with this number\n" +
                "0- Get the additive inverse of the number\n" +
                "1- Get the reciprocal of the number\n" +
                "2- Square the number\n" +
                "3- Cube the number\n" +
                "4- Exit the program");
        userChoice = scan.nextInt();

        switch (userChoice) {
            case 0:
                System.out.println("The additive inverse of " + userNumber + " is " + -userNumber );
                break;
            case 1:
                System.out.println("The reciprocal of " + userNumber + " is " + 1/userNumber);
                break;
            case 2:
                System.out.println("The square of " + userNumber + " is " + Math.pow(userNumber,2));
                break;
            case 3:
                System.out.println("The cube of " + userNumber + " is " + Math.cbrt(userNumber));
                break;
            case 4:
                System.out.println("Thank you, goodbye!");
            default:
                System.out.println("Invalid input, please try again!");
        }
    }
}
