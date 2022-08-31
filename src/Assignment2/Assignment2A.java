/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Assignment#: 2
 */
package Assignment2; //ignore this; this exists here as I organize my code into folders (packages) in intelliJ and GitHub.
import java.util.*;
public class Assignment2A {
    public static void main(String[] args ) {
        int people;
        int groups;
        Scanner scan = new Scanner(System.in);
        System.out.print("How many people are in your group? ");
        people = scan.nextInt();
        System.out.print("How many groups do you want? ");
        groups = scan.nextInt();
        System.out.println("If we divide " + people + " people in " + groups + " evenly, " + people%groups + " person/people will be left without a group.");

    }
}
