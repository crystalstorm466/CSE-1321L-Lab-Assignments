package Assignment4;
import java.util.*;

public class Assignment4A {
    public static void main(String[] args) {
        System.out.println("[CCSE Study Abroad Survey]");
        boolean surveyInProgress = true;
        int Italy = 0;
        int CostaRica = 0;
        int PaxBisonica = 0;
        int Ghana = 0;
        int Student = 0;
        Scanner scan = new Scanner(System.in);
        while (surveyInProgress) {
            System.out.print("Student #" + Student + ": Which country should we go for our next study\n" +
                    " abroad program?\n" +
                    "Italy\n" +
                    "Costa Rica\n" +
                    "Pax Bisonica\n" +
                    "Ghana\n" +
                    "(Type Quit to end the survey)\n" +
                    "");
            String surveyChoice = scan.next(); //todo wont accept spaces in inputs for some reason
            if (surveyChoice.equalsIgnoreCase("Italy")) {
                Italy++;
                System.out.println("Thank you!");
                Student++;
            } else if (surveyChoice.equalsIgnoreCase("Costa Rica")) {
                CostaRica++;
                System.out.println("Thank you!");
                Student++;
            } else if (surveyChoice.equalsIgnoreCase("Pax Bisonica")) {
                PaxBisonica++;
                System.out.println("Thank you!");
                Student++;
            } else if (surveyChoice.equalsIgnoreCase("Ghana")) {
                Ghana++;
                System.out.println("Thank you!");
                Student++;
            } else if (surveyChoice.equalsIgnoreCase("Quit")) {
                surveyInProgress = false;
            }

        }

        System.out.println("[Results]\n" +
                "Italy: " + Italy + "\n" +
                "Costa Rica: " + CostaRica + "\n" +
                "Pax Bisonica: " + PaxBisonica + "\n" +
                "Ghana: " + Ghana + "\n");
        if (Italy > CostaRica) {
            if (Italy > PaxBisonica) {
                if (Italy > Ghana) {
                    System.out.println("Next year's study abroad program will take place in " + "Italy.");
                }
            }
        } else if (CostaRica > Italy) {
            if (CostaRica > PaxBisonica) {
                if (CostaRica > Ghana) {
                    System.out.println("Next year's study abroad program will take place in " + "Costa Rica.");
                }
            }
        } else if (PaxBisonica > CostaRica) {
            if (PaxBisonica > Italy) {
                if (PaxBisonica > Ghana) {
                    System.out.println("Next year's study abroad program will take place in " + "Pax Bisonica.");
                }
            }
        } else if (Ghana > PaxBisonica) {
            if (Ghana > CostaRica) {
                if (Ghana > Italy) {
                    System.out.println("Next year's study abroad program will take place in " + "Ghana.");
                }
            }
        }
    }
}
