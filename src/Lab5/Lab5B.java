package Lab5;
import java.util.*;
public class Lab5B {
    public static void main(String[] args) {
        int userInt;
        int twoCPUInt = 2;
        int threeCPUInt = 3;
        int fiveCPUInt = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        userInt = scan.nextInt();
        twoCPUInt = userInt%twoCPUInt;
        threeCPUInt = userInt%threeCPUInt;
        fiveCPUInt = userInt%fiveCPUInt;
       switch(twoCPUInt ||  threeCPUInt && fiveCPUInt) { //this doesnt work yet obviously
           case (2):
               System.out.println("This number is divisble by 2");

        }
    }
}
