package Assignment7;
import java.util.*;
public class Assignment7A {
    public static void main(String[] args) {
        boolean menu = true;
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        Scanner scan = new Scanner(System.in);
        int state = scan.nextInt();
        System.out.println(" ");
        
        FSA FSAOne = new FSA(state);
        FSAOne.setActive(true);
        System.out.println(" ");
        do {
            int currentState = FSAOne.goToNextState(state);
            System.out.println("What will you do?\n" +
                    "-Go to next state\n" +
                    "-End ");
            String choice = ((scan.nextLine()));
            choice = choice.toLowerCase();

            switch(choice) {
                case "go to next state":
                    
                    System.out.println("You're now at state " + currentState++);
                    break;
                case "end":
                    if (FSAOne.end()) {
                        menu = false;
                        System.out.println("The machine has shut down.");
                        break;
                    } else {
                        System.out.println("Program can only end at state 3");
                        break;
                    }
                default:
                    System.out.println("Invalid option, " + choice );
                    break;    
            }
        } while (menu);
    }
}
