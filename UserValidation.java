import java.util.Scanner;
class UsernameTooShortException extends Exception {
    public UsernameTooShortException(String message) {
        super(message);
    }
}
class PasswordMismatchException extends Exception {
    public PasswordMismatchException(String message) {
        super(message);
    }
}
public class UserValidation {
    public static void validateUser(String username, String password, String confirmPassword) throws UsernameTooShortException, PasswordMismatchException {
        if (username.length() < 6) {
            throw new UsernameTooShortException("Username is too short! It should be at least 6 characters long.");
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException("Passwords do not match! Please make sure both passwords are the same.");
        }
        System.out.println("User successfully validated.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        try {
            validateUser(username, password, confirmPassword);
        } catch (UsernameTooShortException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (PasswordMismatchException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
