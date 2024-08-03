
    
class bike{
    int cost=1000000;
    public int hashCode(){
        return cost;
    }
}
public class Hashcodeoverride {
    public static void main(String[] args) {
    bike b=new bike();
        System.out.println(b);
        System.out.println(b.hashCode());
    }
   

}

