package multiple;


    // Class C implements both interfaces A and B
public class C implements A, B {

    // Implementing method from interface A
    @Override
    public void methodA() {
        System.out.println("Method A from interface A");
    }

    // Implementing method from interface B
    @Override
    public void methodB() {
        System.out.println("Method B from interface B");
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA();  // Calling methodA from interface A
        obj.methodB();  // Calling methodB from interface B
    }
}


