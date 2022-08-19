import java.util.Scanner;
public class Assignment1C {
    public static void main(String args[]) {
            char userChar;
//        The variable was originally input, but I changed it to userChar to make it more readable
        System.out.println("[And the Next Letter is]");
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a letter: ");
        userChar = scan.next().charAt(0);
        char char2 = (char) (userChar + 1);
        char char3 = (char) (char2 + 1);
        char char4 = (char) (char3 + 1);
        System.out.print("The next letters after " + userChar + " are " + char2 + ", " + char3 + ", and " + char4 + "!");
    }

}
