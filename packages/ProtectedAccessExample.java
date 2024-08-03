

public class ProtectedAccessExample {
    // Protected fields
    protected String protectedField1 = "Protected Field 1";
    protected int protectedField2 = 200;

    // Protected methods
    protected void protectedMethod1() {
        System.out.println("Protected Method 1");
    }

    protected void protectedMethod2() {
        System.out.println("Protected Method 2");
    }

    // Method to demonstrate accessing protected members within the same class
    public void accessWithinClass() {
        // Accessing protected fields
        System.out.println("Accessing within class:");
        System.out.println("protectedField1: " + protectedField1);
        System.out.println("protectedField2: " + protectedField2);

        // Accessing protected methods
        protectedMethod1();
        protectedMethod2();
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        ProtectedAccessExample example = new ProtectedAccessExample();

        // Accessing protected members within the same class through a public method
        example.accessWithinClass();
    }
}

