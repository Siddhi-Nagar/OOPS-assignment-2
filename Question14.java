import java.util.Scanner;
class Employee {
    int empId;
    String empName;
    double basicSalary;
    double grossSalary;

    void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Employee Name: ");
        empName = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextDouble();
    }
    void calculateGrossSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        grossSalary = basicSalary + hra + da;
    }
    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Gross Salary: $" + grossSalary);
    }
}
  public class Question14 {
        public static void main(String[] args) {
        Employee emp = new Employee();
        emp.acceptDetails();
        emp.calculateGrossSalary();
        emp.displayDetails();
    }
}
