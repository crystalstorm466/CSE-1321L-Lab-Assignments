/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 3
 */
package Lab3;
import java.text.DecimalFormat;
import java.util.*;

public class Lab3C {
    public static void main(String[] args) {
        float quarter, dime, penny, nickle, dollars;


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
        DecimalFormat roundCoins = new DecimalFormat("########");
        if ( coins >= 1) {
             dollars = (int) (coins % 100);

            System.out.println("Your total is " + (int) dollars + " dollars and " +  roundCoins.format((coins*100)%100) + " cents");
        }
            else {
               System.out.println("Your total is 0 dollars and " + roundCoins.format((coins)*100) + " cents");
        }

    }
}
