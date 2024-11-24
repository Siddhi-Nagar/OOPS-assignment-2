import java.io.IOException;
public class ExceptionHandlingEx {
    public static void methodWithThrows() throws IOException {
        System.out.println("Inside methodWithThrows()");
        throw new IOException("This is a manually thrown IOException.");
    }
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block.");
            int divisionResult = 10 / 0; 
            System.out.println("Result: " + divisionResult); 
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block always executes.");
        }
        try {
            System.out.println("Throwing an exception using 'throw'.");
            throw new NullPointerException("Manually thrown NullPointerException.");
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            methodWithThrows(); 
        } catch (IOException e) {
            System.out.println("Exception caught from methodWithThrows(): " + e.getMessage());
        }

        finally {
            System.out.println("Final finally block in main() always executes.");
        }

        System.out.println("Program ended successfully.");
    }
}
