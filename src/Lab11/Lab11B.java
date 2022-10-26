/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 10
 */
package Lab11;
import java.util.*;
public class Lab11B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scan.next();
        if (password.length() >= 8) {
            boolean number = false;
            boolean upperCase = false;
            boolean length = true; //unnecessary (b/c of if statement)
                                // but the instructions says to have 3 booleans so here you go
            for (int i = 0; i < password.length(); i++) {
                char certainCharacter = password.charAt(i);
                if (Character.isDigit(certainCharacter)) { //easier than using ascii tables
                    number = true;
                }
                if (Character.isUpperCase(certainCharacter)) {
                    upperCase = true;
                }
            }
            if (number && upperCase && length) { //again I don't really need a 3rd condition but yeah
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Password");
        }
    }
}
