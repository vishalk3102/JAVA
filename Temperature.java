import java.util.*;

abstract class Temp {
    protected double temp;

    public void setTemperature(double temp) {
        this.temp = temp;
        System.out.println(temp);
    }

    abstract void changeTemp();
}

class Fahrenheit extends Temp {
    private double celTemp;

    void changeTemp() {
        celTemp = ((temp - 32) * 5) / 9;
        System.out.println("Fahrenheit temperature in celsius is :" + celTemp);
    }
}

class Celsius extends Temp {
    private double fahTemp;

    void changeTemp() {
        fahTemp = ((9 * temp) / 5) + 32;
        System.out.println("Celsius temperature in fahrenheit is :" + fahTemp);
    }
}

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fahrenheit temperature :");
        double fahTemp = sc.nextDouble();
        System.out.println("Enter the celcius temperature :");
        double celTemp = sc.nextDouble();

        Fahrenheit f = new Fahrenheit();
        Celsius c = new Celsius();
        f.setTemperature(fahTemp);
        f.changeTemp();
        c.setTemperature(celTemp);
        c.changeTemp();
    }

}
