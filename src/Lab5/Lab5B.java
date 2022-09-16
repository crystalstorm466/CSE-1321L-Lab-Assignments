/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 5
 */
package Lab5;
import java.util.*;

public class Lab5B {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = scan.nextInt();
        scan.nextLine();

        switch(userNumber % 2) {
            case 0:
                System.out.println("This number is divisible by 2");
                break;
            default:
                if (userNumber % 3 == 0) {
                    System.out.print("This number is divisible by 3");
                } else if (userNumber % 5 == 0) {
                    System.out.println("This number is divisible by 5");
                } else {
                    System.out.println("This number is undetermined");
                }
        };



    }
}
