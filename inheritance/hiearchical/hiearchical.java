package hiearchical;
class car{
    public static void show1(){
    System.out.println("Car Information");
    }
}
class thar extends car{
    public static void show2(int price){
        System.out.println("Mahindra thar" +price);
    }
}
class fortuner extends car{
    public static void show3(int price){
        System.out.println("Toyota Fortuner" +price);
    }
}
public class hiearchical {
    public static void main(String[] args) {
        thar t = new thar();
        t.show1();
        t.show2(200000);
        fortuner f = new fortuner();
        f.show1();
        f.show3(300000);
    }
    
}
