package Assignment4;
import java.util.*;
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence: ");
        String sentence = scan.nextLine();
        System.out.println("How many letters do you want to backspace?");
        int lettersBack = scan.nextInt();
        System.out.print(sentence);
        for (int i = 0; i < lettersBack; i++) { //example could be wrong
            System.out.print("\b\b ");
            Thread.sleep(500);
        }
    }
}
