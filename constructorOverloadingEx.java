class Employee {
    String name;
    int id;
    double salary;

    public Employee() {
        name = "Unknown";
        id = 0;
        salary = 0.0;
    }

    public Employee(String name) {
        this.name = name;
        this.id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.salary = 0.0;
    }
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + salary);
    }
}

public class constructorOverloadingEx {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); 
        Employee emp2 = new Employee("Alice"); 
        Employee emp3 = new Employee("Bob", 101); 
        Employee emp4 = new Employee("Charlie", 102, 55000.0); 

        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
        emp4.displayInfo();
    }
}
