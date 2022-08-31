/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 3
 */
package Lab3; //ignore this; this exists here as I organize my code into folders (packages) in intelliJ and GitHub.
import java.text.DecimalFormat;
import java.util.*;
public class Lab3A {
    public static void main(String[] args) {

        float APR, minPayment, amountOwned;
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount Owned: ");
        amountOwned = sc.nextInt();
        System.out.print("APR: ");
        APR = sc.nextFloat();
        APR/= 12;


       DecimalFormat roundAPR = new DecimalFormat("###.###"); // found on baeldung.com/java-round-decimal-number

        System.out.println("Monthly percentage rate: " + roundAPR.format(APR));

        minPayment = amountOwned * (APR/100);
        DecimalFormat roundMinimumPayment = new DecimalFormat("##.##");
        System.out.println("Minimum payment: $" + roundMinimumPayment.format(minPayment));






    }
}
