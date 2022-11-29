package classProject;

public class weightConversion {
    private int weight;

    private double kg;
    private double lb;

    public double getKg() { return kg;}
    public double getLb() { return lb;}

    public void setKg(double lb) {
        this.lb = lb;
        kg = (lb * 2.205);
    }

    public void setLb(double kg) {
        this.kg = kg;
        lb = (kg * 2.205);

    }
}
