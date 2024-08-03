
class Car {
    private String make;
    private String model;

    // Constructor
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Concrete method
    public void displayDetails() {
        System.out.println("Car Make: " + make + ", Model: " + model);
    }
}

public class concrete {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");

        car1.displayDetails();
        car2.displayDetails();
    }
}
