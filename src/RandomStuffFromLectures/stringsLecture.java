package RandomStuffFromLectures;
import java.util.*;
public class stringsLecture {
    public static void main(String[] args) {
        System.out.println("What is your string? ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("The length of your string is " + input.length());
        System.out.println("What is the second string");
        String twoInput = scan.nextLine();
        if (!input.equals(twoInput)) {
            System.out.println("These strings do not match!");
        }
    /*
        System.out.println("The fifth letter continuing on from string 1 is" + input.substring(5, 10));
        System.out.print("What string would like to replace? ");
        String replaceString = scan.next();
        System.out.print("What is the new string? ");
        String newReplaceString = scan.next();
        System.out.println("The new strings are: " + input.replace(replaceString, newReplaceString));
    */
        //delimiter
        String s1 = "A,B,C,D";
        String[] tokens = s1.split(",");
        for (int i = 0; i < tokens.length; i++) {
            System.out.println (tokens[i]);
        }

    }
}
