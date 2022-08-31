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
public class Assignment2B {

    public static void main(String[] args) {
        System.out.println("[Lerping!]");
        int firstKeyX, secondKeyX, framesPassed;
        float sixtyCurrentX, thirtyCurrentX, placesMoved;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        firstKeyX = scan.nextInt();
        System.out.print("Enter the X coordinate for Keyframe #2: ");
        secondKeyX = scan.nextInt();

        System.out.print("How many frames have passed? ");
        framesPassed = scan.nextInt();

        placesMoved = secondKeyX-firstKeyX;
        System.out.println("The character has to move " + placesMoved + " places in a second.");
        sixtyCurrentX = firstKeyX + (placesMoved * (framesPassed / 60.0f));
        thirtyCurrentX = firstKeyX + (placesMoved * (framesPassed / 30.0f));
        System.out.println("At 30 FPS, their current X position wold be " + thirtyCurrentX);
        System.out.println("At 60 FPS, their current X position wold be " + sixtyCurrentX);


    }
}
