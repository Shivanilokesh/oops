public class nonstaticmethod {
   

       public void printNumber(int number) {
            System.out.println("The number is: " + number);
        }
    
        
       public static void main(String[] args) {
            
            nonstaticmethod  Nonstaticmethod = new nonstaticmethod();
    
            Nonstaticmethod.printNumber(5);
            
        }
    }
    

