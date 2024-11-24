class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class methodOverloadingEx {
        public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(10, 20);         
        int sum2 = math.add(5, 10, 15);       
        double sum3 = math.add(5.5, 7.5);     

        System.out.println("Sum of 10 and 20: " + sum1);
        System.out.println("Sum of 5, 10, and 15: " + sum2);
        System.out.println("Sum of 5.5 and 7.5: " + sum3);
    }
}
