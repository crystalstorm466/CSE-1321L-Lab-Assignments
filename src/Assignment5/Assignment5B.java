package Assignment5;
import java.util.*;
public class Assignment5B {
    public static void main(String[] args) {
        System.out.println("[What's your Sign?]");
        Scanner scan = new Scanner(System.in);

        System.out.println("What month were you born in? ");
        int month = scan.nextInt();
        if (month > 13 || month <= 1) {
            System.out.println("That is not a valid month...\n");
            System.exit(0);
        }
        System.out.println("What day were you born in? ");
        int day = scan.nextInt();
        if (day > 32 || day <= 1) {
            System.out.println("That is not a valid day...\n");
            System.exit(0);
        }

        String[][] signTable = new String[13][32];
        for (int permMonth = 1; permMonth < 13; permMonth++) {
            for (int permDay = 1; permDay < 32; permDay++) {
                switch (permMonth) {
                    case 1:
                        if (permDay < 20) {
                            signTable[permMonth][permDay] = "Capricorn";
                        } else {
                            signTable[permMonth][permDay] = "Aquarius";
                        }
                        break;
                    case 2:
                        if (permDay < 18) {
                            signTable[permMonth][permDay] = "Aquarius";
                        } else {
                            signTable[permMonth][permDay] = "Pisces";
                        }
                        break;
                    case 3:
                        if (permDay < 21) {
                            signTable[permMonth][permDay] = "Pisces";
                        } else {
                            signTable[permMonth][permDay] = "Aries";
                        }
                        break;
                    case 4:
                        if (permDay < 20) {
                            signTable[permMonth][permDay] = "Aries";
                        } else {
                            signTable[permMonth][permDay] = "Taurus";
                        }
                        break;
                    case 5:
                        if (permDay < 21) {
                            signTable[permMonth][permDay] = "Taurus";
                        } else {
                            signTable[permMonth][permDay] = "Gemini";
                        }
                        break;
                    case 6:
                        if (permDay < 21) {
                            signTable[permMonth][permDay] = "Gemini";
                        } else {
                            signTable[permMonth][permDay] = "Cancer";
                        }
                        break;
                    case 7:
                        if (permDay < 23) {
                            signTable[permMonth][permDay] = "Cancer";
                        } else {
                            signTable[permMonth][permDay] = "Leo";
                        }
                        break;
                    case 8:
                        if (permDay < 23) {
                            signTable[permMonth][permDay] = "Leo";
                        } else {
                            signTable[permMonth][permDay] = "Virgo";
                        }
                        break;
                    case 9:
                        if (permDay < 23) {
                            signTable[permMonth][permDay] = "Virgo";
                        } else {
                            signTable[permMonth][permDay] = "Libra";
                        }
                        break;
                    case 10:
                        if (permDay < 23) {
                            signTable[permMonth][permDay] = "Libra";
                        } else {
                            signTable[permMonth][permDay] = "Scorpio";
                        }
                        break;
                    case 11:
                        if (permDay < 22) {
                            signTable[permMonth][permDay] = "Scorpio";
                        } else {
                            signTable[permMonth][permDay] = "Sagittarius";
                        }
                        break;
                    case 12:
                        if (permDay < 22) {
                            signTable[permMonth][permDay] = "Sagittarius";
                        } else {
                            signTable[permMonth][permDay] = "Capricorn";
                        } //this took forever to type out
                        break;
                }
            }
        }
        System.out.println("Your sign is " + signTable[month][day] + "!");
    }
}

