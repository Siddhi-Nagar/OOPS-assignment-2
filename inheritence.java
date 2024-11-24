class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating.");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println(name + " is barking.");
    }
}
public class inheritence {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";
        myDog.eat();  
        myDog.bark(); 
    }
}
