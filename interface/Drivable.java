
// Interface 1
interface Drivable {
    void drive();
}

// Interface 2
interface Fuelable {
    void refuel();
}

// Class implementing both interfaces
class Car implements Drivable, Fuelable {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    // Implementing method from Drivable interface
    @Override
    public void drive() {
        System.out.println("The " + model + " is driving.");
    }

    // Implementing method from Fuelable interface
    @Override
    public void refuel() {
        System.out.println("The " + model + " is being refueled.");
    }
}

