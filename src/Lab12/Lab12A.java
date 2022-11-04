/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 12
 */
package Lab12;
import java.util.*;

public class Lab12A {
    public static class Chair { //chiar make class,
       public static int numOfLegs;
       public static boolean rolling;
       public static String material;
    }
    public static void main(String[] args) { //driver class
        Chair newChair = new Chair();
        Scanner scan = new Scanner(System.in);
        System.out.println("You are about to create a chair.");
        System.out.print("How many legs does your chair have: ");
        newChair.numOfLegs = scan.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        newChair.rolling = scan.nextBoolean();
        System.out.println("What is your chair made out of: ");
        newChair.material = scan.next();
        String rollingString = null;
        if (newChair.rolling) {
            rollingString = "is rolling";
        } else {
            rollingString = "is not rolling";
        }
        System.out.println("Your chair has " + newChair.numOfLegs + " legs, " + rollingString + ", and is made of " + newChair.material  + ".");
        System.out.println("This program is going to change that.");

        changeChair(newChair.material, newChair.rolling, newChair.numOfLegs);
    }

    public static void changeChair(String mat, boolean roll, int legs) { //changeChair class
        mat = "wood";
        roll = false;
        legs = 8;
        String rollingString = null;
        if (roll) {
            rollingString = "is rolling";
        } else {
            rollingString = "is not rolling";
        }
        System.out.println("Your chair has " + legs + " legs, " + rollingString + ", and is made of " + mat  + ".");

    }
}