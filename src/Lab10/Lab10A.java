/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 10
 */
package Lab10;
import java.util.*;
public class Lab10A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = scan.nextInt();
        int a, b = maxInt(num1, num2);
        double e, f = averageInt(num1, num2);
        System.out.println("Min is " + minInt(num1, num2));
        System.out.println("Max is " + maxInt(num1, num2));
        System.out.println("Average is " + averageInt(num1, num2));
    }

    public static int maxInt(int a, int b) {
        if (a >= b) {
            return a;
        } else if (b >= a) {
            return b;
        }
        return 0;
    }

    public static int minInt(int c, int d) {
        if (c <= d) {
            return c;
        } else if (c <= d) {
            return d;
        }
        return 0;
    }

    public static double averageInt(double e, double f) {
        return (e + f) / 2;
    }
}
