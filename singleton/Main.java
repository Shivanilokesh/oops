// Singleton class
class Singleton {
    
    private static Singleton singleInstance = null;

    
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }


    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Try to create two instances
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // Show messages from the instances
        instance1.showMessage();
        instance2.showMessage();

        // Check if both instances are the same
        if (instance1 == instance2) {
            System.out.println("Both instances are the same");
        } else {
            System.out.println("Instances are different");
        }
    }
}
