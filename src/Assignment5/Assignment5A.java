package Assignment5;
import java.util.*;
public class Assignment5A {
    public static void main(String[] args) {
        System.out.println("[Top 5 Friend's List]");

        Scanner scan = new Scanner(System.in);
        boolean inProgress = true;

        String [] friendsList = new String[5];
        while(inProgress) {
            System.out.println("What would you like to do?\n" +
                    "1) Enter a friend's name\n" +
                    "2) Replace a friend's name\n" +
                    "3) Display your friend's list\n" +
                    "4) Quit");
            System.out.print("Your choice: ");
            int menuChoice = scan.nextInt();
            int counter = 1;
            if (menuChoice == 1) {
                System.out.print("Enter a name: ");
                String friendsName = scan.next();
                for (int i = 0; i <= friendsList.length; i++) {
                    if(friendsName == friendsList[i]) {
                        System.out.println("Sorry, they're already on the list!");
                        break;
                    } else if (friendsList[counter] == null) {
                        friendsList[counter] = friendsName;
                        counter++;
                        break;
                    } else {
                      System.out.println("Sorry, this list is full!");
                      break;
                    }
                }
            }

            if (menuChoice == 2) {
                System.out.println("Enter a name: ");
                String replaceName = scan.nextLine();
                System.out.println("Enter an index: ");
                int index = scan.nextInt();

                if (friendsList[index] == replaceName) {
                    System.out.println("Sorry, they're already on the list!");
                    break;
                } else {
                    System.out.println(replaceName + " has replaced " + friendsList[index] + " on your friends list!");
                    friendsList[index] = replaceName;
                    break;
                }
            }

            if (menuChoice == 3) {
                System.out.println("Friend's List");
                for (int i = 0; i < friendsList.length; i++) {
                    System.out.println(i + ") " + friendsList[i]);
                }
            }

            if (menuChoice == 4) {
                System.exit(0);
            }
        }
    }
}
