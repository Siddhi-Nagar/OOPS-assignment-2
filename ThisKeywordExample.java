class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name; 
        this.id = id;    
        this.salary = salary;
    }  

    void display() {
        System.out.println("Employee Name: " + this.name); 
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: " + this.salary);
    }

    void showDetails() {
        System.out.println("Showing employee details:");
        this.display(); 
}
public class ThisKeywordExample {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 101, 50000);
        emp.showDetails();
    }
  }
 }
