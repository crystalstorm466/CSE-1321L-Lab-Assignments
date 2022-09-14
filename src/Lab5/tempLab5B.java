package Lab5;
import java.util.*;

public class tempLab5B {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userNumber = scan.nextInt();


        switch(userNumber) {
            case 2:
               if (userNumber %2 == 2) {
                   System.out.println("This number is divisible by 2");
                   break;
               } else {
                   break;
               }
            case 3:
                if (userNumber %3 == 3) {
                    System.out.println("This number is divisible by 3");
                    break;
                } else {
                    break;
                }
            case 5:
                if (userNumber %5 == 5) {
                    System.out.println("This number is divisible by 5");
                    break;
                } else {
                    break;
                }
            default:
                throw new IllegalStateException("This number is undetermined");
        }
        System.out.println(userNumber%=2);
        System.out.println(userNumber%=3);
        System.out.println(userNumber%=5);


    }
}
