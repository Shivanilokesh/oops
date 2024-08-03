// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

// Main class to test upcasting and downcasting
public class CastingExample {
    public static void main(String[] args) {
        
        Animal myDog = new Dog(); // Upcasting
        Animal myCat = new Cat(); // Upcasting

        myDog.makeSound(); 
        myCat.makeSound(); 

       
        if (myDog instanceof Dog) { // Check to ensure safe downcasting
            Dog realDog = (Dog) myDog;
            realDog.bark(); // Outputs: Dog barks
        }

        if (myCat instanceof Cat) { // Check to ensure safe downcasting
            Cat realCat = (Cat) myCat;
            realCat.meow(); // Outputs: Cat meows
        }

       
    }
}
