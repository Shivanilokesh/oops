class shape{
    public static void show1(){
        System.out.println("Display Area");
    }
        
    }
class Rectangle extends shape{
    public static void show2(int l, int b){
       System.out.println(l*b);
    }
}

public class Single {
    public static void main(String[] args) {
        Rectangle sc = new Rectangle();
        sc.show1();
        sc.show2(10, 20);
    }
}
