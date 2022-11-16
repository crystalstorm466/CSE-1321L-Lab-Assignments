package Assignment7;

import java.util.Random;
import java.util.Scanner;

public class Assignment7B {
    public static void main(String[] args) {
        int notActive = 0;
        FSA fsaArray[] = new FSA[3];
        for (int i = 0; i < fsaArray.length; i++) {
            Random rand = new Random();
            fsaArray[i] = new FSA(rand.nextInt(3));
            System.out.println("Machine #" + i + " is starting at state " + fsaArray[i].showCurrentState());
            fsaArray[i].setActive(true);
        }

        
        boolean menu = true;
        Scanner scan = new Scanner(System.in);
        
        
        do {
        System.out.println("What will you do?\n" +
                "-Check current status\n" +
                "-Go to the next state\n" +
                "-End ");
        
       // System.out.println(" ");
        
        String choice = ((scan.nextLine()).toLowerCase());
        
        switch (choice) {
            case "check current status":
                System.out.print("What machine will you look at? ");
                int machine = scan.nextInt();

                System.out.println("Machine #" + machine + " is active and at state " + fsaArray[machine].showCurrentState());
                scan.nextLine();
                break;
            case "go to the next state":
                System.out.print("What machine will you advance? ");
                machine = scan.nextInt();
                int currentState = fsaArray[machine].goToNextState(fsaArray[machine].showCurrentState());
                System.out.println("Machine #" + machine + " is now at state " + currentState);
                scan.nextLine();
                break;
            case "end":
                System.out.println("What machine will you stop? ");
                machine = scan.nextInt();
                scan.nextLine();
                if (fsaArray[machine].end()) {
                    fsaArray[machine].setActive(false);
                    System.out.println("Machine #" + machine + " is now deactivated");
                    break;
                } else {
                    System.out.println("Program can only end at state 3");
                    break;
                }
            default:
                System.out.println("Invalid command");    
        }
        for (int i = 0; i < fsaArray.length; i++) {
            if (!(fsaArray[i].isActive())) {
                notActive++;
            }
            if (notActive >= 3) {
                menu = false;
                System.out.println("All machines have been turned off.");
                System.exit(0);
            }
        }
    } while(menu);

    }

}
