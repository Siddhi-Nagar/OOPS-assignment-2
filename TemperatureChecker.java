import java.util.Scanner;
class TooHot extends Exception {
    public TooHot(String message) {
        super(message);
    }
}
class TooCold extends Exception {
    public TooCold(String message) {
        super(message);
    }
}
public class TemperatureChecker {
    public static void checkTemperature(int temperature) throws TooHot, TooCold {
        if (temperature > 35) {
            throw new TooHot("Temperature is too hot!");
        } else if (temperature < 5) {
            throw new TooCold("Temperature is too cold!");
        } else {
            System.out.println("Normal Temperature");
            double fahrenheit = (temperature * 9.0/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit + "°F");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
    
        int temperature = scanner.nextInt();

        try {
            checkTemperature(temperature);
        } catch (TooHot e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (TooCold e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
