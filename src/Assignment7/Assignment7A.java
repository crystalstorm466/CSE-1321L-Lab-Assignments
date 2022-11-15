package Assignment7;
import java.util.*;
public class Assignment7A {
    public static void main(String[] args) {
        System.out.println("[Finite State Automata]");
        System.out.print("What state do you want to start at? ");
        Scanner scan = new Scanner(System.in);
        int state = scan.nextInt();
        System.out.println(" ");
        boolean menu = true;
        FSA FSAOne = new FSA(state);
        do {
            System.out.println(" ");
            System.out.print("What will you do?\n" +
                    "-Go to next state\n" +
                    "-End ");
            String choice = ((scan.nextLine()).toLowerCase());
            switch(choice) {
                case "go to next state":
                    int currentState = FSAOne.goToNextState(state);
                    System.out.println("You're now at state " + currentState);
                    break;
                case "end":
                case "stop":
                    if (FSAOne.end()) {
                        menu = false;
                        System.out.println("The machine has shut down.");
                        break;
                    } else {
                        System.out.println("Program can only end at state 3");
                        break;
                    }
            }
        } while (menu);
    }
}
