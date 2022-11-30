package Equestria;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class equestriaSourceCode {
    public static void main(String[] args) {
        System.out.println("Welcome to Equestria.");
        String[] cities = new String[5];
        cities[1] = "Canterlot";
        cities[2] = "Ponyville";
        cities[3] = "Manehatten";
        cities[4] = "Las pegasus";

        for (int i = 1; i < cities.length; i++) {
            System.out.println("Existing Cities: " + cities[i]);
        }
        System.out.println("-----------------------------------------");
        System.out.println("These are the brand new cities that we will explore.");
        int counter = 0;
        String cityName = null;
        String [] listOfCities = new String[5];
        for (int i = 0; i <= 2; i++) {
                counter++;
                System.out.println("We found a new place for a city. Please describe it.");
                System.out.print("What natural wonders do we see? ");
                Scanner scan = new Scanner(System.in);
                String naturalWonder = scan.next();
                System.out.println("How many buildings do you estimate? ");
                int buildings = scan.nextInt();
                System.out.println("How many residences do you estimate? ");
                int residences = scan.nextInt();
                citiesManager newCity = new citiesManager(buildings, residences, naturalWonder, counter);
                newCity.setNaturalWonders(naturalWonder, counter);
                System.out.println("What is the name of the city? ");
                cityName = scan.next();
                newCity.setCities(cityName, counter);
                Arrays.fill(listOfCities, cityName); //todo  I need to figure out how to save the names of the cities outside of the loop
        }
        for (int n = 0; n < listOfCities.length; n++) {
            System.out.println("City " + n + ": " + listOfCities[n]);
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
