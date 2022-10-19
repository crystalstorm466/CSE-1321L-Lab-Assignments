package Assignment5;
import java.util.*;
public class Assignment5B {
    public static void main(String[] args) {
        System.out.println("[What's your Sign?]");
        Scanner scan = new Scanner(System.in);

        System.out.println("What month were you born in? ");
        int month = scan.nextInt();
        if (month >= 13) {
            System.out.println("That is not a valid month...\n");
            System.exit(0);
        }
        int day = scan.nextInt();
        if (month >= 13) {
            System.out.println("That is not a valid day...\n");
            System.exit(0);
        }


        String [] [] signTable = new String [12] [31];
        for (int fixedMonth = 1; fixedMonth < 12; month++) {
            for (int fixedDay = 1; fixedDay < 21; fixedDay++) {
                if ((fixedMonth == 12 || fixedMonth == 1)  & fixedDay >= 22) {
                    signTable[12] [fixedDay] = "Capricornus";
                } else (fixedMonth == 1 || fixedMonth == 2 & fixedDay >= 20 ) {
                    signTable[]
                }
            }
        }

        String yourSign = signTable[month] [day];
        System.out.println("Your sign is " + yourSign);




    }
}

