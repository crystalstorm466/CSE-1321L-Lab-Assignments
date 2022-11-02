/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 4
 */
package Lab04;
import java.util.*;
public class Lab4B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userDay;
        System.out.print("Enter the day: ");
        userDay = scan.next();
        /* I knew about toLowerCase from python and I just used the auto syntax completion in
        intelliJ to find toLowerCase.
         */

        switch (userDay.toLowerCase()) {
            case "monday":
                System.out.println("I have class today!");
                break;
            case "wednesday":
                System.out.println("I have class today!");
                break;
            case "friday":
                System.out.println("It's Friday! Friday! Gotta get down on Friday!");
                break;
            default:
                System.out.println("I should use this time to do my homework");
        }
    }
}
