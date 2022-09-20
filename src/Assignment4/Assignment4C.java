package Assignment4;
import java.util.*;
public class Assignment4C {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("[Backspace Animation]");
        System.out.println("Please enter your sentence: ");
        String sentence = scan.next();
        System.out.println("How many letters do you want to backspace?");
        int lettersBack = scan.nextInt();
        for (int i = 0; i < lettersBack; i++) {
            System.out.print(sentence + "\b");
            Thread.sleep(500);
        }
    }
}
