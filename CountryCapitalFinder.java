import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}
public class CountryCapitalFinder {
    private static final Map<String, String> countryCapitalMap = new HashMap<>();
    static {
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Germany", "Berlin");
    }
    public static String getCapital(String country) throws NoMatchFoundException {
        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country); 
        } else {
            throw new NoMatchFoundException("No capital found for the country: " + country);
        }
    }

  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the country: ");
        String country = scanner.nextLine();

        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is: " + capital);
        } catch (NoMatchFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
