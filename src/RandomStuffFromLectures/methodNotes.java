package RandomStuffFromLectures;
import java.util.*;
public class methodNotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = testModule();

        System.out.println("Your name is: " + userInput);

        System.out.println(" ");
    }

    private static String testModule() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String userInput = scan.nextLine();

        return userInput;
    }


}
