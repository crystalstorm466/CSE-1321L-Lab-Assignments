/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 6
 */
package Lab6;
import javax.swing.*;
import java.util.*;

public class Lab6C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance = 1000;
        System.out.println("Welcome!\n" +
                "You have $" + balance + " in your account.");
        System.out.println(" ");
        boolean menuDone = true;
        do {
            System.out.println("Menu\n" +
                    "0 - Make a deposit\n" +
                    "1 - Make a withdrawal\n" +
                    "2 - Display account value ");
            System.out.print("Please make a selection: ");
            int menuChoice = scan.nextInt();

            if (menuChoice == 0) {
                System.out.print("How much would you like to deposit? ");
                int depositAmount = scan.nextInt();
                balance += depositAmount;
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                char answer = scan.next().charAt(0);
                if (answer == 'N') {
                    break;
                } else if (answer == 'Y') {
                    //do nothing return to top
                }
            } else if (menuChoice == 1) {
                System.out.print("How much would you like to withdraw? ");
                int withdrawAmount = scan.nextInt();
                balance -= withdrawAmount;
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                char answer = scan.next().charAt(0);
                if (answer == 'N') {
                    break;
                } else if (answer == 'Y') {
                    //do nothing return to top
                }
            } else if (menuChoice == 2) {
                System.out.println("Your current balance is $" + balance);
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                char answer = scan.next().charAt(0);
                if (answer == 'N') {
                    break;
                } else if (answer == 'Y') {
                    //do nothing return to top
                }
            } else {
                System.out.println("Invalid entry, please try again.");
                System.out.print("Would you like to return to the main menu (Y/N)? : ");
                char answer = scan.next().charAt(0);
                if (answer == 'N') {
                    break;
                } else if (answer == 'Y') {
                    //do nothing return to top
                }
            }
        }while (menuDone);
    }
}

