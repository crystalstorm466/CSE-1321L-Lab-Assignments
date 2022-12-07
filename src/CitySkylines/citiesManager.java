package CitySkylines;

public class citiesManager {

    private int buildings;
    private int residences;
    private String naturalWonders;
    private String cities;

    public citiesManager() {
        buildings = getBuildings();
        residences = getResidences();
        naturalWonders = getNaturalWonders();
        cities = getCities();
    }


    public String getNaturalWonders() { return naturalWonders; }
    public int getBuildings() { return buildings; }
    public int getResidences() { return residences; }
    public String getCities() { return cities; }

    public void setCities(String cities) {
        this.cities = cities;
    }

    public void setBuildings(int buildings) {
        this.buildings = buildings;
    }

    public void setResidences(int residences) {
        this.residences = residences;
    }

    public void setNaturalWonders(String nat) {
        this.naturalWonders = nat;
    }
}
