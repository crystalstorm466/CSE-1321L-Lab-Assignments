/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 6
 */
package Lab6;
import java.util.*;
public class Lab6B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userChoice;
        int tries = 0;

        System.out.println("Enter a number between 1 and 1000 ");
        userChoice = scan.nextInt();

        while ((userChoice >= 1)) {
                tries++;
                Random rand = new Random();
                float randInt = rand.nextInt(1000);
                if (randInt == userChoice) {
                    System.out.println("I guessed the number was " + userChoice + " and it only took me " + tries + " guesses");
                    break;
                }
            }
        while ((userChoice <= 0 || userChoice > 1000)) {
            System.out.println("Invalid number");
            System.out.println("Enter a number between 1 and 1000 ");
            userChoice = scan.nextInt();
        }
        }
    }
