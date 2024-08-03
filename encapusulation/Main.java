
 class person {
    
    private String name;
    private int age;

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

 
    public void setAge(int age) {
      
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
     
        person person = new person();

        person.setName("John Doe");
        person.setAge(25);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Try setting an invalid age
        person.setAge(-5);  // This should trigger the validation logic
    }
}

