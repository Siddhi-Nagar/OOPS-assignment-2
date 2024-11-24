import java.util.Scanner;

public class ConsecutiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine(); 
        int sum = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            int consecutiveNumber = Integer.parseInt(number.substring(i, i + 2));
            sum += consecutiveNumber;
        }
        System.out.println("The sum of consecutive numbers is: " + sum);
    }
}
