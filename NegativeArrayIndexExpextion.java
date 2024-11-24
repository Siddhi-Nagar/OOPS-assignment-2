public class NegativeArrayIndexExpextion {
    public static void main(String[] args) {
        try {
            System.out.println("Attempting to create an array with negative size...");
            int[] negativeArray = new int[-5];  
        } catch (NegativeArraySizeException e) {
            System.out.println("Exception caught: " + e);
        }
        try {
            System.out.println("Attempting to divide by zero...");
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
        }
        System.out.println("Program completed.");
    }
}
