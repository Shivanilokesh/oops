public class methodoverloading {
    

        // Method with no parameters
        public void display() {
            System.out.println(" no parameters");
        }
    
        // Method with one integer parameter
        public void display(int number) {
            System.out.println(" one integer parameter: " + number);
        }
    
        // Method with one string parameter
        public void display(String message) {
            System.out.println(" one string parameter: " + message);
        }
    
        // Method with two parameters
        public void display(int number, String message) {
            System.out.println(" two parameters: " + number + " and " + message);
        }
    
        public static void main(String[] args) {
            // Creating an instance of the class
            methodoverloading Methodoverloading = new methodoverloading();
    
            //   overloaded 
            Methodoverloading.display();
            Methodoverloading.display(10);
            Methodoverloading.display("Hello, World!");
            Methodoverloading.display(25, "SHIVANI");
        }
    }
    

