package CitySkylines;
import java.util.*;

public class citySkylines {
    public static void main(String[] args) {
        System.out.println("Welcome to Equestria.");
        String[] oldCities = new String[5];
        oldCities[1] = "Canterlot";
        oldCities[2] = "Ponyville";
        oldCities[3] = "Manehatten";
        oldCities[4] = "Las pegasus";

        for (int i = 1; i < oldCities.length; i++) {
            System.out.println("Existing Cities: " + oldCities[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.println("These are the brand new cities that we will explore.");
        for (int i = 0; i <= 5; i++) {
                citiesManager newCity [] = new citiesManager[5];
                System.out.println("We found a new place for a city. Please describe it.");
                System.out.print("What natural wonders do we see? ");
                Scanner scan = new Scanner(System.in);
                String naturalWonder = scan.next();
                System.out.println("How many buildings do you estimate? ");
                newCity[i].setBuildings(scan.nextInt());
                System.out.println("How many residences do you estimate? ");
                newCity[i].setResidences(scan.nextInt());

                newCity[i].setNaturalWonders(naturalWonder);
                System.out.println("What is the name of the city? ");
                newCity[i].setCities(scan.next());
            for (int b = 0; b < newCity.length; b++) {
                System.out.println("City " + i +": " + newCity[i].getCities());
            }
        }

        System.out.println("-----------------------------------------");
        Budget equestrianBudget = new Budget();
        System.out.print("How much did we get in the budget this year? ");
        Scanner scan = new Scanner(System.in);
        equestrianBudget.setBudget(scan.nextDouble());
        System.out.print("How much do you want to spend on the military? ");
        equestrianBudget.setMilitarySpending(scan.nextDouble());
        System.out.print("We need to upgrade our internet to the multiversal one so we can communicate with Sci-Twi so how" +
                "much? ");
        equestrianBudget.setNetworkUpgrades(scan.nextDouble());
        double budget = equestrianBudget.getBudget();
        double spent = equestrianBudget.getTotalSpent();
        if (budget < spent) {
            double remainder = spent - budget;
            System.out.println("We went over budget by " + remainder + " bits.");
            System.out.println("We need to save some bits.");
        } else {
            double leftOver = budget - spent;
            System.out.println(leftOver + " bits are left over so we can pay back the Griffins and the hippogriffs.");
        }
        System.out.println("-----------------------------------------");
        System.out.println("We will now propose a new budget.");
        System.out.print("How much do you want to spend on the military? ");
        double military = scan.nextDouble();
        System.out.println("The network is fine. Does not need to be upgraded.");
        System.out.println("How much does the government need this year? ");
        double government = scan.nextDouble();
        Budget proposedBudget = new Budget(government, military, 0);

        System.out.println("The new budget break down is:\n" +
                "________________________________________________________________\n" +
                "Government Spending: " + proposedBudget.getGovernmentSpending() + "\n" +
                "Military Spending: " + proposedBudget.getMilitarySpending() + "\n" +
                "Network Spending: " + proposedBudget.getNetworkUpgrades() + "\n" +
                "________________________________________________________________\n" +
                "Total Spent: " + proposedBudget.getTotalSpent() + "\n" +
                "Overbudget? " + proposedBudget.overBudget());

    }

    private static HashMap<String, String> newCitiesPlanned() {
        HashMap<String, String> newCities = new HashMap<String, String>();
        newCities.put("Buckingham", "Trottingham");
        newCities.put("Las vegas", "Las pegasus");
        newCities.put("Las pegasus", "Friendship U");
        System.out.println("We plan to buy out Friendship U");
        return newCities;
    }
}