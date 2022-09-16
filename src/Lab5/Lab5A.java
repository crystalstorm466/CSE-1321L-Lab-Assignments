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

public class Lab5A {
    public static void main(String[] args) {
        char permitAnswer;
        char licenseAnswer;
        Scanner scan = new Scanner(System.in);
        System.out.print("Do you have a driving permit (Y/N)? ");
        permitAnswer = scan.next().charAt(0);
        if (!(permitAnswer == 'Y')) {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        } else if (permitAnswer == 'Y') {
            System.out.println("Do you have a commercial driving license (Y/N)? ");
            licenseAnswer = scan.next().charAt(0);
            if (!(licenseAnswer == 'Y')) {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            } else if (licenseAnswer == 'Y') {
                System.out.println("Congratulations! You can purchase a vehicle, let’s start talking options!");
            }
        }
    }
}
