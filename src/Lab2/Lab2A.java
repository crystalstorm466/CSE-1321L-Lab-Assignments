package Lab2;/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 2
 */

import java.util.*;
public class Lab2A {
    public static void main (String[] args) {
        String firstName;
        String secondName;
        String verb;
        String adverb;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        firstName = scan.nextLine();

        System.out.print("Enter another Name: ");
        secondName = scan.nextLine();

        System.out.print("Enter a verb: ");
        verb = scan.nextLine();

        System.out.print("Enter an adverb: ");
        adverb = scan.nextLine();

        System.out.print("Once upon a time, there was a person named " + firstName + " who had a child named " + secondName + ". This child would " + verb + " " + adverb + " while singing to strangers.");





    }
}
