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

public class Lab3C {
    public static void main(String[] args) {
        float quarter;
        float dime;
        float penny;
        float nickle;
        float dollars;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of quarters: ");
        quarter = scan.nextFloat();

        System.out.print("Enter the number of dimes: ");
        dime = scan.nextFloat();

        System.out.print("Enter the number of nickels: ");
        nickle = scan.nextFloat();

        System.out.print("Enter the number of pennies: ");
        penny = scan.nextFloat();

        System.out.println("You entered " + quarter + " quaters.");
        System.out.println("You entered " + dime + " dimes.");
        System.out.println("You entered " + nickle + " nickles.");
        System.out.println("You entered " + penny + " pennies.");

        quarter*=0.25;
        dime*=0.10;
        nickle*=0.05;
        penny*=0.01;
        double coins;
        coins = (quarter+dime+nickle+penny);

        double v = 1.00;
        if ( coins >= v) {
             dollars = (float) (coins % 100);
            System.out.println("Your total is " + (int) dollars + " dollars and " + (int) coins*100 + " cents");
        }
            else {
               System.out.println("Your total is 0 dollars and " + (quarter + dime + nickle + penny)*100 + " cents");
        }

    }
}
