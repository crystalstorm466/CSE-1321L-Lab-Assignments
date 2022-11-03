/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 11
 */
package Lab11;
import java.util.*;
public class Lab11A {
    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            System.out.println("Menu");
            System.out.println("0) Hello World\n" +
                    "1) Goodbye Moon\n" +
                    "2) Walking on Sunshine ");
            System.out.print("What you would you like to do: ");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();

            if (choice == 0) {
                System.out.println("Hello!");
                menu = optionToQuit();
            } else if (choice == 1) {
                System.out.println("Ok, bye.");
                menu = optionToQuit();
            } else if (choice == 2) {
                System.out.println("WHOA");
                menu = optionToQuit();
            }
        }
    }
    public static boolean optionToQuit() {
        System.out.println(" ");
        System.out.print("Type YES to rerun. ");
        Scanner scan = new Scanner(System.in);
        String exitChoice = scan.next();
        if (exitChoice.equalsIgnoreCase("yes")) { //this allows any form of YeS
            return true;
        } else {
            return false; // or System.exit(0);
        }
    }
}
