package Assignment3;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;
public class Assignment3A {
    public static void main(String[] args) {
        System.out.println("[Epic Quest Simulator]");
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello stranger! Do you have time to hear my tale?\n" +
                "1) Yes\n" +
                "2) No");
        int userChoice;

        userChoice = scan.nextInt();
        scan.nextLine();

        if (userChoice == 1) {
            System.out.println("Thank you! I come from a land of Pax Bisonica" +
                    " Our country has been taken over by a cruel tyrant!\n" +
                    "1) That's awful!\n" +
                    "2) What can I do?");
            userChoice = scan.nextInt();
            scan.nextLine();
            if (userChoice == 1) {
                System.out.println("Alas, it's truly terrible...");
            }
            System.out.println("Please, you must journey to Pax Bisonica and free " +
                    "our country!\n" +
                    "1) No\n" +
                    "2) Okay");
            userChoice = scan.nextInt();
            scan.nextLine();
            if (userChoice == 1) {
                System.out.println("Then all is lost...");
            } else if (userChoice == 2) {
                System.out.print("Horray!!");
            } else {
                System.out.println("Ah, then goodbye...");
            }
        }
    }
}