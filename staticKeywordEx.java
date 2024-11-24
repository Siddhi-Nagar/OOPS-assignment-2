class Employee {
    static int employeeCount = 0;

    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
        employeeCount++;  
    }
    
    static void displayEmployeeCount() {
        System.out.println("Total number of employees: " + employeeCount);
    }
    void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
    }
}
public class staticKeywordEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Alice");
        Employee emp2 = new Employee(102, "Bob");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayEmployeeCount();
    }
}

