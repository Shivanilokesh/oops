package multilevel;
class Addition{
    public void add(int a, int b)
    {
        System.out.println("Addition is "+ (a+b));
    }
    }
    class Subtraction extends Addition{
    public void sub(int a, int b)
    {
        System.out.println("Subtraction is "+(a-b));
    }
    }
    class Multiplication extends Subtraction{
        public void mul(int a, int b)
        {
            System.out.println("Multiplication is "+(a*b));
        }

    }
    class Div extends Multiplication{
        public void div(int a, int b)
        {
            System.out.println("Divsion is"+(a/b));
        }
        public void CallAllMethods()
        {
            add(3, 2);
            sub(10, 2);
            mul(10, 5);
            div(20, 5);
        }
    }
public class multilevel extends Div{
   public static void main(String[] args) {
    Div d = new Div();
    d.CallAllMethods();
   } 
}

    

