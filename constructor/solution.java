class Student {
    int age;
    String name;

    // Constructor to initialize age and name
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class solution {
    public static void main(String[] args) {
        // Create instances of Student
        Student student1 = new Student(20, "shivani");
        Student student2 = new Student(22, "devi");

        // Store the instances in an array
        Student[] students = {student1, student2};

        // Traverse the array using a for loop
        for (Student student : students) {
            System.out.println("Name: " + student.name + ", Age: " + student.age);
        }
    }
}
