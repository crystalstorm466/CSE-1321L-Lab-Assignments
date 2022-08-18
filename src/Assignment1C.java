import java.util.Scanner;
public class Assignment1C {
    public static void main(String args[]) {
        char input;
        System.out.println("[And the Next Letter is]");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a letter: ");
        input = scan.next().charAt(0);
        char char2 = (char) (input + 1);
        char char3 = (char) (char2 + 1);
        char char4 = (char) (char3 + 1);
        System.out.print("The next letters after " + input + " are " + char2 + ", " + char3 + ", and " + char4 + "!");
    }

}
