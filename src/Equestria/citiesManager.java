package Equestria;

public class citiesManager {

    private int buildings;
    private int residences;
    private String[] naturalWonders = new String[5];
    private String[] cities = new String[5];
    public citiesManager() {

    }
    public citiesManager(int build, int resid, String nat, int counter) {
        this.buildings = build;
        this.residences = resid;
        this.naturalWonders[counter] = nat;
    }

    public String[] getNaturalWonders() { return naturalWonders; }
    public int getBuildings() { return buildings; }
    public int getResidences() { return residences; }
    public String[] getCities() { return cities; }

    public void setCities(String cities, int counter) {
        this.cities[counter] = cities;
    }

    public void setBuildings(int buildings) {
        this.buildings = buildings;
    }

    public void setResidences(int residences) {
        this.residences = residences;
    }

    public void setNaturalWonders(String nat, int counter) {
        this.naturalWonders[counter] = nat;
    }
}
