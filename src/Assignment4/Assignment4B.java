package Assignment4;
import java.util.*;
public class Assignment4B {
    public static void main(String[] args) {
            System.out.println("Welcome");
            Scanner scan = new Scanner(System.in);
            float userNumber;
            System.out.print("Please input a number: ");
            userNumber = scan.nextFloat();
            if (userNumber == 0) {
                int userChoice;
                System.out.println("What would you like to do with this number\n" +
                        "-1- Re-enter the number\n" +
                        "0- Get the additive inverse of the number\n" +
                        "2- Square the number\n" +
                        "3- Cube the number\n" +
                        "4- Exit the program");
            } else {
                System.out.println("What would you like to do with this number\n" +
                        "-1- Re-enter the number\n" +
                        "0- Get the additive inverse of the number\n" +
                        "1- Get the reciprocal of the number\n" +
                        "2- Square the number\n" +
                        "3- Cube the number\n" +
                        "4- Exit the program");
            }
            int userChoice = scan.nextInt();
            boolean inProgress = true;
           while(inProgress) {
               switch (userChoice) {
                   case -1:
                       System.out.print("Please input a number: ");
                       userNumber = scan.nextFloat();
                       System.out.println("What would you like to do with this number\n" +
                               "-1- Re-enter the number\n" +
                               "0- Get the additive inverse of the number\n" +
                               "1- Get the reciprocal of the number\n" +
                               "2- Square the number\n" +
                               "3- Cube the number\n" +
                               "4- Exit the program");
                       userChoice = scan.nextInt();
                       break;
                   case 0:
                       System.out.println("The additive inverse of " + userNumber + " is " + -userNumber );
                       System.out.println("What would you like to do with this number\n" +
                               "-1- Re-enter the number\n" +
                               "0- Get the additive inverse of the number\n" +
                               "1- Get the reciprocal of the number\n" +
                               "2- Square the number\n" +
                               "3- Cube the number\n" +
                               "4- Exit the program");
                       userChoice = scan.nextInt();
                       break;
                   case 1:
                       System.out.println("The reciprocal of " + userNumber + " is " + 1/userNumber);
                       System.out.println("What would you like to do with this number\n" +
                               "-1- Re-enter the number\n" +
                               "0- Get the additive inverse of the number\n" +
                               "1- Get the reciprocal of the number\n" +
                               "2- Square the number\n" +
                               "3- Cube the number\n" +
                               "4- Exit the program");
                       userChoice = scan.nextInt();
                       break;
                   case 2:
                       System.out.println("The square of " + userNumber + " is " + Math.pow(userNumber,2));
                       System.out.println("What would you like to do with this number\n" +
                               "-1- Re-enter the number\n" +
                               "0- Get the additive inverse of the number\n" +
                               "1- Get the reciprocal of the number\n" +
                               "2- Square the number\n" +
                               "3- Cube the number\n" +
                               "4- Exit the program");
                       userChoice = scan.nextInt();
                       break;
                   case 3:
                       System.out.println("The cube of " + userNumber + " is " + Math.cbrt(userNumber));
                       System.out.println("What would you like to do with this number\n" +
                               "-1- Re-enter the number\n" +
                               "0- Get the additive inverse of the number\n" +
                               "1- Get the reciprocal of the number\n" +
                               "2- Square the number\n" +
                               "3- Cube the number\n" +
                               "4- Exit the program");
                       userChoice = scan.nextInt();
                       break;
                   case 4:
                       System.out.println("Thank you, goodbye!");
                       inProgress = false;
                       break;
                   default:
                       System.out.print("Please enter a valid number between -1 and 4: ");
                       userChoice =  scan.nextInt();
                       inProgress = true;
               }
           }
        }
    }
