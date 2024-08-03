
    public class PublicAccessExample {
        // Public fields
        public String publicField1 = "Public Field 1";
       
    
        // Public method
        public void publicMethod1() {
            System.out.println("Public Method 1");
        }
    
        
    
        // Method to demonstrate accessing public members within the same class
        public void accessWithinClass() {
            // Accessing public fields
            System.out.println("Accessing within class:");
            System.out.println("publicField1: " + publicField1);
            
    
            // Accessing public methods
            publicMethod1();
           
        }
    
        public static void main(String[] args) {
            // Creating an instance of the class
            PublicAccessExample example = new PublicAccessExample();
    
            // Accessing public members within the same class
            example.accessWithinClass();
    
            // Accessing public members directly
            System.out.println("\nAccessing directly from main method:");
            System.out.println("publicField1: " + example.publicField1);
           
    
            // Calling public methods directly
            example.publicMethod1();
            
        }
    }
    

