class Animal {
        // Method to be overridden
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    
    class Dog extends Animal {
        // Overriding the makeSound method in the Animal class
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }
    
    class Cat extends Animal {
        // Overriding the makeSound method in the Animal class
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }
    
    public class methodoverriding {
        public static void main(String[] args) {
            // Creating instances of the subclasses
            Animal myDog = new Dog();
            Animal myCat = new Cat();
    
            // Calling the overridden methods
            myDog.makeSound();
            myCat.makeSound();
        }
    }
    

