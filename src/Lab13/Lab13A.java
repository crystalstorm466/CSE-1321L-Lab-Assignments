/*
    Class: 1321L
    Section: J02
    Term: Fall 2022
    Instructor: Aarthi Poovalingam
    Name: David Holland
    Lab#: 13
 */
//package Lab13;
public class Lab13A {
    public static void main(String[] args) {
        BuildingBlueprint buildingOne = new BuildingBlueprint();
        BuildingBlueprint buildingTwo = new BuildingBlueprint(30, 30, 0.75F);


        System.out.println("Year 2020:");
        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, " +
                "and is " + (int) buildingOne.getOccupancyRate() + "%" + " occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, " +
                "and is " +  (int) (buildingTwo.getOccupancyRate() * 100 ) + "%" + " occupied. Full? " + buildingTwo.getFull());
        System.out.println("Many years pass.");
        System.out.println("Year 2043:");

        buildingOne.setOccupancyRate(0);
        buildingTwo.setOccupancyRate(1);
        buildingOne.setFull(false);
        buildingTwo.setFull(true);

        System.out.println("Building 1 has " + buildingOne.getStories() + " floors, " + buildingOne.getApartments() + " apartments, " +
                "and is " + (int) buildingOne.getOccupancyRate() + "%" + " occupied. Full? " + buildingOne.getFull());
        System.out.println("Building 2 has " + buildingTwo.getStories() + " floors, " + buildingTwo.getApartments() + " apartments, " +
                "and is " + (int) buildingTwo.getOccupancyRate() + "%" + " occupied. Full? " + buildingTwo.getFull());

        System.out.println("Looks like people prefer taller buildings.");
    }


}
class BuildingBlueprint {
    private int stories;
    private int apartments;
    private float occupancyRate;
    private boolean fullyOccupied;

    public BuildingBlueprint() {
        stories = 10;
        apartments = 20;
        occupancyRate = 100;
        fullyOccupied = true;
    }
    public BuildingBlueprint(int stories, int apartments, float occupancy) {
        if (occupancy >= 1) {
            fullyOccupied = true;

        }

        this.stories = stories;
        this.apartments = apartments;
        this.occupancyRate = occupancy;
    }

    int getStories() { return stories;}
    int getApartments() { return apartments;}
    float getOccupancyRate() { return occupancyRate;}
    boolean getFull() { return fullyOccupied;}

    void setStories(int newStories) {
        stories = newStories;
    }
    void setApartments(int newApartments) {
        apartments = newApartments;
    }
    void setOccupancyRate(int newOccupancyRate) {
        newOccupancyRate = newOccupancyRate*100;
        occupancyRate =  (newOccupancyRate);
    }
    void setFull(boolean full) {
        fullyOccupied = full;
    }
}
