

public class DefaultAccessExample {
  
    String defaultField1 = "Default Field 1";
   

    void defaultMethod1() {
        System.out.println("Default Method 1");
    }

   

    
    public void accessWithinClass() {
       
        System.out.println("Accessing within class:");
        System.out.println("defaultField1: " + defaultField1);
      

        defaultMethod1();
        
    }

    public static void main(String[] args) {
        // Creating an instance of the class
        DefaultAccessExample example = new DefaultAccessExample();

    }
}

