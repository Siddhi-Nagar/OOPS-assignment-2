class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
    void sleep() {
        System.out.println("This animal sleeps to rest.");
    }
}
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks on four legs.");
    }
}
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
    void wagTail() {
        System.out.println("The dog wags its tail.");
    }
}
   public class multilevelInheritenceEx {
    public static void main(String[] args) {
    Dog dog = new Dog();
        
        System.out.println("Dog's behaviors inherited from Animal, Mammal, and Dog classes:");
        dog.eat();
        dog.sleep();       
        dog.walk();        
        dog.bark();        
        dog.wagTail();    
    }
}
