package celsiusToFahrenheit;

public class CelsiusToFahre {
    private double Celsius;

    public CelsiusToFahre(double celsius) {
        this.Celsius = celsius;
    }
    public double toFahrez(){
        return (9.0 / 5) * this.Celsius + 32;
    }

    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double celsius) {
        Celsius = celsius;
    }
}
