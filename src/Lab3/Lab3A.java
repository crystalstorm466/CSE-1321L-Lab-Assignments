/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 3
 */
package Lab3;
import java.util.*;
public class Lab3A {
    public static void main(String[] args) {
        int amountOwned;
        double APR;
        double minPayment;
        Scanner sc = new Scanner(System.in);
        System.out.print("Amount Owned: ");
        amountOwned = sc.nextInt();
        System.out.print("APR: ");
        APR = sc.nextDouble();

        System.out.println("Monthly percentage rate: " + APR/12);
        minPayment = (amountOwned * APR) / 12;
        System.out.println("Minimum payment: " + minPayment);






    }
}
