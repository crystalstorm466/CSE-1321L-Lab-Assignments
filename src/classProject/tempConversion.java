package classProject;

class tempConversion {
    private int temperature;
    private double fahrenheit;
    private double celsius;
    private double kelvin;


    public double getFahrenheit() { return fahrenheit; }
    public double getCelsius() { return celsius; }
    public double getKelvin() { return kelvin;}
    public void convertFahrenheit (double fahrenheit) { //converts fahr to celsius
        this.fahrenheit = fahrenheit;
        celsius = ((fahrenheit - 32) * (.5556));
    }

    public void convertCelsius (double celsius) { //converts celsius to fahr
        this.celsius = celsius;
        fahrenheit = ((1.8 * celsius) + 32);
    }
    public void convertCelToKelvin(double kelvin) {
        this.kelvin = kelvin;
        kelvin = (celsius + 273.15);
    }

    public void convertFahToKelvin(double fahrenheit) {
        this.fahrenheit = fahrenheit;
        kelvin = ((fahrenheit - 32) * 5/9 + 273.15);
    }
}
