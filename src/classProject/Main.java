package classProject;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        boolean Menu = true;

        Scanner scan = new Scanner(System.in);
        do {
           System.out.println("What type of conversion do you want to do? ");
           scan = new Scanner(System.in);
           String typeOfConversion = (scan.next().toLowerCase());
            if (typeOfConversion.equals("temperature")) {
                System.out.print("What type of conversion?\n" +
                        "1. Celsius to Fahrenheit\n" +
                        "2. Fahrenheit to Celsius\n" +
                        "3. Celsius to Kelvin\n");
                int choice = scan.nextInt();
                switch (choice) { //TODO do temperature
                    case 1:
                        System.out.println(" ");
                        System.out.print("Celsius = ");
                        double celsius = scan.nextDouble();
                        tempConversion temp1 = new tempConversion();
                        temp1.convertCelsius(celsius);
                        System.out.print("Fahrenheit = " + temp1.getFahrenheit());
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.print("Fahrenheit = ");
                        double fahrenheit = scan.nextDouble();
                        tempConversion temp2 = new tempConversion();
                        temp2.convertFahrenheit(fahrenheit);
                        System.out.println("Celsius = " + temp2.getCelsius());
                        break;
                    case 3: //cel to kelv
                        System.out.println(" ");
                        System.out.print("Celsius = ");
                        double kelvin = scan.nextDouble();
                        tempConversion temp3 = new tempConversion();
                        temp3.convertCelToKelvin(kelvin);
                        System.out.println("Kelvin = " + temp3.getKelvin());
                        break;
                    case 4: //fah to kelv
                        System.out.println(" ");
                        System.out.print("Fahrenheit = ");
                        fahrenheit = scan.nextDouble();
                        tempConversion temp4 = new tempConversion();
                        temp4.convertFahToKelvin(fahrenheit);
                        System.out.println("Kelvin = " + temp4.getKelvin());
                        break;

                    default:
                        throw new IllegalStateException("Unexpected value: Please try again" + choice);
                }
            } else if (typeOfConversion.equalsIgnoreCase("weight")) {
                System.out.print("What should be converted?\n" +
                        "1. lb to kg\n" +
                        "2. kg to lb ");
                int choice = scan.nextInt();
                switch (choice) { //TODO do weight
                    case 1:
                        System.out.print("What is the original weight? (lb) ");
                        double lb = scan.nextDouble();
                        weightConversion weight1 = new weightConversion();
                        weight1.setKg(lb);
                        System.out.print("KG = " + weight1.getKg());
                        break;
                    case 2:
                        System.out.print("What is the original weight? (kg) ");
                        double kg = scan.nextDouble();
                        weightConversion weight2 = new weightConversion();
                        weight2.setLb(kg);
                        System.out.println("Pounds = " + weight2.getLb());
                        break;
                    default:
                        throw new IllegalStateException("Try again. " + choice);
                }
            } else if (typeOfConversion == "currency") {
                System.out.print("What should be converted?\n" +
                        "1. EUR TO USD\n" +
                        "2. USD to EUR ");
                int choice = scan.nextInt();
                switch (choice) { //TODO do currency
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
