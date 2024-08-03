public class person {
    // Member variables
    private String name;
    private int age;

    
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public void display() {
        String name = "hii"; 
        int age = 0;             

        
        System.out.println("Name: " + this.name); // Prints the member variable 'name'
        System.out.println("Age: " + this.age);   // Prints the member variable 'age'

       
        System.out.println("Local Name: " + name); // Prints the local variable 'name'
        System.out.println("Local Age: " + age);   // Prints the local variable 'age'
    }

    public static void main(String[] args) {
        // Create a new Person object
        person person = new person("shivi", 30);

        // Call the displayInfo method to show the details
        person.display();
    }
}
