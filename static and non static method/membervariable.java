public class membervariable {
    

        // Member variables
        private String name;
        private int age;
    
        
        public membervariable(String name, int age) {
            // Using 'this' keyword 
            this.name = name;
            this.age = age;
        }
    
        
        public void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    
        public static void main(String[] args) {
            
            membervariable membervariable = new membervariable("shivani", 22);
    
            
            membervariable.display();
        }
    }
    

