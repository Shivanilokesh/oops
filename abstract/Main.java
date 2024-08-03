// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal is eating");
    }
}

// Subclass Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Subclass Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
    
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); 
        myCat.makeSound(); 

       
        myDog.eat(); 
        myCat.eat(); 
    }
}
