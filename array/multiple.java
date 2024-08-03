 
    public class multiple {
        public static void main(String[] args) {
            int[] numbers = {3, 5, 10, 12, 15, 22, 25, 30}; 
    
            System.out.println("Multiples of 5 in the array:");
            for (int number : numbers) {
                if (number % 5 == 0) {
                    System.out.println(number);
                }
            }
        }
    }
    

