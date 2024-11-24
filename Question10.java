class Vehicle {
    protected String regnNumber;
    protected int speed;
    protected String color;
    protected String ownerName;

    Vehicle(String regnNumber, int speed, String color, String ownerName) {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    void showData() {
        System.out.println("This is a vehicle class.");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
    }
}
class Bus extends Vehicle {
    private int routeNumber;
    Bus(String regnNumber, int speed, String color, String ownerName, int routeNumber) {
        super(regnNumber, speed, color, ownerName);  
        this.routeNumber = routeNumber;
    }
    @Override
    void showData() {
        super.showData();  
        System.out.println("Bus Route Number: " + routeNumber);
    }
}
class Car extends Vehicle {
    private String manufacturerName;

    Car(String regnNumber, int speed, String color, String ownerName, String manufacturerName) {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    @Override
    void showData() {
        super.showData();  
        System.out.println("Car Manufacturer Name: " + manufacturerName);
    }
}

public class Question10 {
    public static void main(String[] args) {
        Bus bus = new Bus("KA-05-1234", 60, "Yellow", "John Doe", 25);
        System.out.println("Bus Details:");
        bus.showData();  
        System.out.println();

        Car car = new Car("MH-01-AB-5678", 120, "Red", "Jane Smith", "Toyota");
        System.out.println("Car Details:");
        car.showData();  
}
}
    
