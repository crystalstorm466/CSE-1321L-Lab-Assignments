package RandomStuffFromLectures;

import java.util.HashMap;

public class equestriaSourceCode {
    public static void main(String[] args) {
        System.out.print("Welcome to Equestria.");
        String [] cities = new String [5];
        cities[1] = "Canterlot";
        cities[2] = "Ponyville";
        cities[3] = "Manehatten";
        cities[4] = "Las pegasus";

        for (int i = 1; i < cities.length; i++) {
            System.out.println("City: " + cities[i]);
        }
        System.out.println("These are the brand new cities that we will explore.");
        System.out.println("New cities planned: ");
        HashMap newCities = newCitiesPlanned();
        System.out.println(newCities);

        Budget equestrianBudget = new Budget();
        equestrianBudget.setBudget(400000);
        equestrianBudget.setMilitarySpending(2000);
        equestrianBudget.setNetworkUpgrades(2300);
        double budget = equestrianBudget.getBudget();
        double governmentSpending = equestrianBudget.getGovernmentSpending();
        double militarySpending = equestrianBudget.getMilitarySpending();
        double networkUpgrades = equestrianBudget.getNetworkUpgrades();
        double spent = equestrianBudget.getTotalSpent();
        double remainder = spent-budget;
        System.out.println("Remaining budget: " + remainder);
    }

    private static HashMap<String, String> newCitiesPlanned() {
        HashMap<String, String> newCities = new HashMap<String, String>();
        newCities.put("Buckingham", "Trottingham");
        newCities.put("Las vegas", "Las pegasus");
        System.out.println("We plan to buy out Friendship U");
        newCities.put("Las pegasus", "Friendship U");
        return newCities;
    }
}
