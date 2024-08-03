public class employee {
     // Attributes
     private int id;
     private String name;
     private double salary;
 
     // Constructor to initialize the attributes
     public employee(int id, String name, double salary) {
         this.id = id;
         this.name = name;
         this.salary = salary;
     }
 
     // Method to display employee details
     public void display() {
         System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
     }
 }

