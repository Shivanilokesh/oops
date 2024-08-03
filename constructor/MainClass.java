public class MainClass {
    public static void main(String[] args) {
        // Creating three instances of Employee
        employee emp1 = new employee(1, "shivi", 20000);
        employee emp2 = new employee(2, "devi",20000);
        employee emp3 = new employee(3, "prajna", 70000);

        // Storing the instances in an array
        employee[] employees = { emp1, emp2, emp3 };

        // Traversing the array and printing the details of each employee
        for (employee emp : employees) {
            emp.display();
        }
    }
}


