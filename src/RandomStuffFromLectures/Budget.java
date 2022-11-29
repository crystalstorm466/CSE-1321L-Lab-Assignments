package RandomStuffFromLectures;

public class Budget {
    private double budget;
    private double governmentSpending;
    private double militarySpending;
    private double networkUpgrades;
    private double totalSpent;

    public double getBudget() {
        return budget;
    }

    public double getMilitarySpending() {
        return militarySpending;
    }
    public double getTotalSpent() {
        double spent = militarySpending+networkUpgrades+governmentSpending;
        return (spent);
    }

    public double getNetworkUpgrades() {
        return networkUpgrades;
    }

    public double getGovernmentSpending() {
        return governmentSpending;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setMilitarySpending(double militarySpending) {
        this.militarySpending = militarySpending;
    }
    public void setNetworkUpgrades(double networkUpgrades) {
        this.networkUpgrades = networkUpgrades;
    }


}
