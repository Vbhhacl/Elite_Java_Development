package Elite_b;

//create an interface named Temperature with double cToF(double cel) and double fToC(double fah) 
//create a class named TemperatureConverter implementing Temperature interface implement methods from super interface and write conversion logic 
//create TestTemperatureClass with main method to test code

// Interface
interface Temperature1 {
    double cToF(double cel);
    double fToC(double fah);
}

// Implementation class
class TemperatureConverter implements Temperature1 {

    @Override
    public double cToF(double cel) {
        return (cel * 9 / 5) + 32;
    }

    @Override
    public double fToC(double fah) {
        return (fah - 32) * 5 / 9;
    }
}

// Main class
public class Temperature {

    public static void main(String[] args) {

        TemperatureConverter tc = new TemperatureConverter();

        double celsius = 25;
        double fahrenheit = 77;

        System.out.println(celsius + " °C = " + tc.cToF(celsius) + " °F");
        System.out.println(fahrenheit + " °F = " + tc.fToC(fahrenheit) + " °C");
    }
}