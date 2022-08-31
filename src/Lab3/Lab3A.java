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
        int amountOwned;
        float APR;
        float minPayment;
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount Owned: ");
        amountOwned = sc.nextInt();
        System.out.print("APR: ");
        APR = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("###.###"); // found on baeldung.com/java-round-decimal-number

        System.out.println("Monthly percentage rate: " + df.format(APR/12));
        minPayment = Float.parseFloat((df.format((amountOwned * APR)/ 12)));
        System.out.println("Minimum payment: " + minPayment);






    }
}
