/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Assignment#: 2
 */
package Assignment2; //ignore this; this exists here as I organize my code into folders (packages) in intelliJ and GitHub.
import java.text.DecimalFormat;
import java.util.*;
import java.lang.Math; // found on educative.io to round
public class Assignment2C {
    public static void main(String[] args) {
        int userUSDollar;
        float UKPound;
        float BisPound;
        final double convertUKPound = 0.85;
        final double convertBisPound = 5;

        System.out.println("[Bisonica Currency Exchange]");
        System.out.println("General Bison welcomes you to Pax Bisonica!");
        Scanner scan = new Scanner(System.in);
        System.out.print("How many US dollars do you have? ");
        userUSDollar = scan.nextInt();
        UKPound = (float) (userUSDollar*convertUKPound);
        BisPound = (float) (UKPound/convertBisPound);
        DecimalFormat df = new DecimalFormat("##.##"); // found on baeldung.com/java-round-decimal-number
        System.out.println(userUSDollar + " US Dollar(s) " + UKPound + " British Pound(s),\n " +
                "which is worth " + df.format(BisPound) + " Bison Dollar(s)");


    }
}
