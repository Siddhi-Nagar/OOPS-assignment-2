class Animal {
    void sound() {
     System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}
public class methodOverridingEx {
        public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound(); 
        Animal myCat = new Cat();
        myCat.sound(); 
        Animal genericAnimal = new Animal();
        genericAnimal.sound();
}
}
