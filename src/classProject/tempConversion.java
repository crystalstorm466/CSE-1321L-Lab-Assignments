package classProject;

class tempConversion {
    private int temperature;
    private double fahrenheit;
    private double celsius;
    private double kelvin;


    public double getFahrenheit() { return fahrenheit; }
    public double getCelsius() { return celsius; }
    public double getKelvin() { return kelvin;}
    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        celsius = ((fahrenheit - 32) * (.5556));
    }

    public void setCelsius (double celsius) {
        this.celsius = celsius;
        fahrenheit = ((1.8 * celsius) + 32);
    }
    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
        kelvin = (celsius + 273.15);
    }
}
