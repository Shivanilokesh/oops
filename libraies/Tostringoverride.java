
 

class Person{
    int age=22;
    String name="shivi";
    public String toString(){
        return age+"\n"+name;
    }
}
public class Tostringoverride {
    public static void main(String[] args) {
        Person p=new Person();
        System.out.println(p.toString());
        System.out.println(p);
    }
}
