package classProject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean Menu = true;
        do {
            System.out.println("What type of conversion do you want to do? ");
            Scanner scan = new Scanner(System.in);
            String typeOfConversion = (scan.next().toLowerCase());
            if (typeOfConversion == "temperature") {
                System.out.print("What type of conversion?\n" +
                        "1. Celsius to Fahrenheit\n" +
                        "2. Fahrenheit to Celsius\n" +
                        "3. Celsius to Kelvin\n" +
                        "4. Kelvin to Celsius\n" +
                        "5. Fahrenheit to Kelvin\n" +
                        "6. Kelvin to Fahrenheit ");
                int choice = scan.nextInt();
                switch(choice) { //TODO do temperature
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: Please try again" + choice);
                }
            } else if (typeOfConversion == "weight") {
                System.out.print("What should be converted?\n" +
                        "1. lb to kg\n" +
                        "2. kg to lb ");
                int choice = scan.nextInt();
                switch(choice) { //TODO do weight
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        throw new IllegalStateException("Try again. " + choice);
                }
            } else if (typeOfConversion == "currency") {
                System.out.print("What should be converted?\n" +
                        "1. EUR TO USD\n" +
                        "2. USD to EUR ");
                int choice = scan.nextInt();
                switch(choice) { //TODO do currency
                    case 1:
                        break;
                    case 2:
                        break;
                    default:
                        throw new IllegalStateException("Try again. " + choice);
                }
            }
        } while (Menu);
    }
}
