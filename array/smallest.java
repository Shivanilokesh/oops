 public class smallest {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 10, 12, 15, 22, 25, 30}; 

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Iterate through the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        // Print the smallest element
        System.out.println("The smallest element in the array is: " + smallest);
    }
}
 
    

