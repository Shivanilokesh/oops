package constructoroverloading;

public class person3 {
    
        private String name;
        private int age;
    
        
        public person3() {
            this.name = "Unknown";
            this.age = 0;
        }
    
        
        public person3(String name) {
            this.name = name;
            this.age = 0;
        }
    
        
        public person3(String name, int age) {
            this.name = name;
            this.age = age;
        }
    
        public void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }
    
        public static void main(String[] args) {
            // Creating objects using different constructors
            person3 person1 = new person3();
            person1.display();
    
            person3 person2 = new person3("shivani");
            person2.display();
    
            person3 person3 = new person3("shivani", 22);
            person3.display();
        }
    }

