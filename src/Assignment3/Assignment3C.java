package Assignment3;
import java.util.*;
public class Assignment3C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String phoneModel;
        int phoneVersion;
        System.out.println("[App Checklist]");
        System.out.print("What mobile device do you have? ");
        phoneModel = scan.next();

        if ((Objects.equals(phoneModel, "Apple")) || ((Objects.equals(phoneModel, "Android")))) {
            System.out.print("What version do you have? ");
            phoneVersion = scan.nextInt();
            scan.nextLine();
            if ((Objects.equals(phoneModel, "Apple")) && phoneVersion >= 12) {
                String bluetoothIOS;
                System.out.print("Does your device support Bluetooth connections? ");
                bluetoothIOS = scan.next();
                if (bluetoothIOS.equals("Yes")) {
                    System.out.println("Congratulations, you can run the app!");
                }
                else {
                    System.out.println("I’m sorry, our app does not support your device.");
                }
            } else if (!(phoneVersion >= 11)) {
                System.out.println("I’m sorry, our app does not support your device.");
            } else {
                String supportAR;
                System.out.print("Does your device support Augmented Reality? ");
                supportAR = scan.next();
                if (supportAR.equals("Yes")) {
                    System.out.println("Congratulations, you can run the app!");
                } else {
                    System.out.println("I’m sorry, our app does not support your device.");
                }
            }

        } else {
            System.out.println("I’m sorry, our app does not support your device.");
        }


    }
}
