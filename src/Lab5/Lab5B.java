package Lab5;
import java.util.*;
public class Lab5B {
    public static void main(String[] args) {
        int userInt;
        int twoCPUInt;
        int threeCPUInt;
        int fiveCPUInt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        userInt = scan.nextInt();
        scan.nextLine();

        if (((userInt % 2) == 0) || ((userInt % 3) == 0) || ((userInt % 5) == 0)) {
            switch(userInt) {
                case (2):

            }
        }

       switch(userInt) { //this doesnt work yet obviously
           case (2):

           case (3):

           case (5):
           default:
               System.out.println("Undefined");
        }
    }
}
