package celsiusToFahrenheit;

public class FahretoCelsius {
    private double Fahre;

    public FahretoCelsius(double Fahre) {
        this.Fahre = Fahre;
    }
    public double toCelsius(){
        return (5.0 / 9) * (this.Fahre - 32);
    }

    public double getFahre() {
        return Fahre;
    }

    public void setFahre(double fahre) {
        Fahre = fahre;
    }
}
