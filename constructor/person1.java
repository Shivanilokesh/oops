public class person1 {
    private String name;
    private int age;

    public person1(){
    this.name = "none";
    this.age = 0;
}

public void display(){
    System.out.println("Name:" + name + ", Age: " + age);
}
public static void main(String[] args) {
    person1 Person1 = new person1();
    Person1.display();

    person1 Person2 = new person1();
    Person2.display();
}
}


