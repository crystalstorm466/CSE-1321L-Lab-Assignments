package Assignment2;
import java.util.*;
public class Assignment2B {

    public static void main(String[] args) {
        System.out.println("[Lerping!]");
        int firstKeyX;
        int secondKeyX;
        int framesPassed;
        double sixtyCurrentX;
        double thirtyCurrentX;
        double placesMoved;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the X coordinate for Keyframe #1: ");
        firstKeyX = scan.nextInt();
        System.out.print("Enter the X coordinate for Keyframe #2: ");
        secondKeyX = scan.nextInt();

        System.out.print("How many frames have passed? ");
        framesPassed = scan.nextInt();

        placesMoved = secondKeyX-firstKeyX;
        System.out.println("The character has to move " + placesMoved + " places in a second.");
        sixtyCurrentX = (placesMoved * (framesPassed/60)) + 0;
        thirtyCurrentX = firstKeyX + (placesMoved * (framesPassed/30));
        System.out.println("At 60 FPS, their current X position wold be " + sixtyCurrentX);
        System.out.println("At 30 FPS, their current X position wold be " + thirtyCurrentX);


    }
}
