import java.util.Scanner;
abstract class ThreeDObject {
    abstract double volume();
    abstract double wholeSurfaceArea();
}
class Box extends ThreeDObject {
    double length, width, height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    double volume() {
        return length * width * height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }
}
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    @Override
    double volume() {
        return side * side * side;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * (side * side);
    }
}

class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}
class Cone extends ThreeDObject {
    double radius, height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double volume() {
        return (Math.PI * radius * radius * height) / 3;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt((radius * radius) + (height * height));
        return Math.PI * radius * (radius + slantHeight);
    }
}
public class Question9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length, width, and height of the Box: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Box box = new Box(length, width, height);
        System.out.println("Box Volume: " + box.volume());
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());

        System.out.print("Enter side length of the Cube: ");
        double side = scanner.nextDouble();
        Cube cube = new Cube(side);
        System.out.println("Cube Volume: " + cube.volume());
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());

        System.out.print("Enter radius and height of the Cylinder: ");
        double radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(radius, height);
        System.out.println("Cylinder Volume: " + cylinder.volume());
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());

        System.out.print("Enter radius and height of the Cone: ");
        radius = scanner.nextDouble();
        height = scanner.nextDouble();
        Cone cone = new Cone(radius, height);
        System.out.println("Cone Volume: " + cone.volume());
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());

        scanner.close();
    }
}
