interface InterfaceA {
    void methodA1();
    void methodA2();
}
interface InterfaceB {
    void methodB1();
    void methodB2();
}
interface InterfaceC {
    void methodC1();
    void methodC2();
}
interface CombinedInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newMethod();
}
class ConcreteClass {
    void concreteMethod() {
     System.out.println("This is a method from the Concrete Class.");
    }
}
class MyClass extends ConcreteClass implements CombinedInterface {
    public void methodA1() {
        System.out.println("Method A1 implementation.");
    }
    public void methodA2() {
        System.out.println("Method A2 implementation.");
    }
    public void methodB1() {
        System.out.println("Method B1 implementation.");
    }
    public void methodB2() {
        System.out.println("Method B2 implementation.");
    }
    public void methodC1() {
        System.out.println("Method C1 implementation.");
    }
    public void methodC2() {
        System.out.println("Method C2 implementation.");
    }
    public void newMethod() {
        System.out.println("New method implementation from CombinedInterface.");
    }
}
public static void methodUsingA(InterfaceA a) {
    a.methodA1();
    a.methodA2();
}
public static void methodUsingB(InterfaceB b) {
    b.methodB1();
    b.methodB2();
}
public static void methodUsingC(InterfaceC c) {
    c.methodC1();
    c.methodC2();
}
public static void methodUsingCombined(CombinedInterface combined) {
    combined.newMethod();
}
public class Question18 {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println("Using InterfaceA:");
        methodUsingA(myObject);
        
        System.out.println("\nUsing InterfaceB:");
        methodUsingB(myObject);
        
        System.out.println("\nUsing InterfaceC:");
        methodUsingC(myObject);
        
        System.out.println("\nUsing CombinedInterface:");
        methodUsingCombined(myObject);
        
        myObject.concreteMethod();
    }
}
