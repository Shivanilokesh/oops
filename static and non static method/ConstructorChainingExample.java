// Superclass
class Animal {
    // Superclass constructor
    Animal() {
        System.out.println("Animal created");
    }

    // Overloaded constructor with parameters
    Animal(String name) {
        this(); // Calls the no-argument constructor
        System.out.println("Animal name: " + name);
    }
}

// Subclass
class Dog extends Animal {
    // Subclass constructor
    Dog() {
        super("Dog"); // Calls the superclass constructor with a parameter
        System.out.println("Dog created");
    }

    // Overloaded constructor with parameters
    Dog(String breed) {
        this(); // Calls the no-argument constructor of the subclass
        System.out.println("Dog breed: " + breed);
    }
}

// Main class to test constructor chaining
public class ConstructorChainingExample {
    public static void main(String[] args) {
        // Creating an instance of Dog using the parameterized constructor
        System.out.println("Creating Dog object with breed:");
        Dog myDog = new Dog("Labrador");
        
        // Creating an instance of Dog using the no-argument constructor
        System.out.println("\nCreating Dog object with no arguments:");
        Dog anotherDog = new Dog();
    }
}

