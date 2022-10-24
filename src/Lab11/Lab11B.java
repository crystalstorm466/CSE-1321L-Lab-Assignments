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
            for (int i = 0; i < password.length(); i++) {
                char certainCharacter = password.charAt(i);
                if (Character.isDigit(certainCharacter)) {
                    number = true;
                }
                if (Character.isUpperCase(certainCharacter)) {
                    upperCase = true;
                }
            }
            if (number && upperCase) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Password");
        }
    }
}
