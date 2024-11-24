class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class customExceptionEx {
    public static double calculate(double a, double b, String operation) throws CustomArithmeticException {
        switch (operation) {
            case "divide":
                if (b == 0) {
                    throw new CustomArithmeticException("Division by zero is not allowed!");
                }
                return a / b;

            case "multiply":
                double result = a * b;
                if (result > Double.MAX_VALUE || result < -Double.MAX_VALUE) {
                    throw new CustomArithmeticException("Overflow during multiplication!");
                }
                return result;

            default:
                throw new CustomArithmeticException("Invalid operation. Only 'divide' or 'multiply' are supported.");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println("Result: " + calculate(10, 0, "divide"));
        } catch (CustomArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + calculate(Double.MAX_VALUE, 2, "multiply"));
        } catch (CustomArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("Result: " + calculate(10, 2, "divide"));
        } catch (CustomArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
