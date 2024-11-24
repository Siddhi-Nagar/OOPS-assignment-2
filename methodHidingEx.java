class Parent {
    static void display() {
        System.out.println("This is a static method in the Parent class.");
    }
}
class Child extends Parent {
    static void display() {
        System.out.println("This is a static method in the Child class.");
    }
}
public class methodHidingEx {
    public static void main(String[] args) {
        Parent.display(); 
        Child.display();  
        Parent parentRef = new Child();
        parentRef.display(); 
    }
}
