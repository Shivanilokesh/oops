public class PrivateAccessExample {
   
        // Private fields
        private String privateField1 = "Private Field 1";
      
    
        // Private methods
        private void privateMethod1() {
            System.out.println("Private Method 1");
        }
    
      
            
        // Method to demonstrate accessing private members within the same class
        public void accessWithinClass() {
            // Accessing private fields
            System.out.println("Accessing within class:");
            System.out.println("privateField1: " + privateField1);
     
    
            // Accessing private methods
            privateMethod1();
           
        }
    
        public static void main(String[] args) {
            // Creating an instance of the class
            PrivateAccessExample example = new PrivateAccessExample();
    
    
            
        }
    }
    

