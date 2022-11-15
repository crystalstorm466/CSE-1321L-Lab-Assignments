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
        }
        boolean menu = true;
        Scanner scan = new Scanner(System.in);
        do {
        System.out.print("What will you do?\n" +
                "- Check current status\n" +
                "-Go to the next state\n" +
                "-End ");
        System.out.println(" ");
        String choice = ((scan.nextLine()).toLowerCase());
        switch (choice) {
            case "check current status":
                System.out.print("What machine will you look at? ");
                int machine = scan.nextInt();
                System.out.println("Machine #" + machine + " is active and at state " + fsaArray[machine].showCurrentState());
                break;
            case "go to next state":
                System.out.print("What machine will you advance? ");
                machine = scan.nextInt();
                System.out.println("Machine #" + machine + " is now at state " + fsaArray[machine].goToNextState(machine));
            case "end":
            case "stop":
                System.out.println("What machine will you stop? ");
                machine = scan.nextInt();
                if (fsaArray[machine].end()) {
                    menu = false;
                    System.out.println("Machine #" + machine + " is now deactivated");
                    break;
                } else {
                    System.out.println("Program can only end at state 3");
                    break;
                }
        }
        for (int i = 0; i < fsaArray.length; i++) {
            if (!(fsaArray[i].isActive())) {
                notActive++;
            }
            if (notActive == 4) {
                menu = false;
                System.out.println("All machines have been turned off.");
                System.exit(0);
            }
        }
    } while(menu);

    }

}
