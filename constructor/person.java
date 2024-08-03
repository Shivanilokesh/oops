public class person {
    private String name;
    private int age;

    public person(String name, int age){
    this.name = name;
    this.age = age;
}

public void display(){
    System.out.println("Name:" + name + ", Age: " + age);
}
public static void main(String[] args) {
    person Person1 = new person("shivani", 21);
    Person1.display();

    person Person2 = new person("devika", 21);
    Person2.display();
}
}

