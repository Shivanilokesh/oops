public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 10, 12, 15, 22, 25, 30}; 

        // Assume the first element is the largest
        int largest = numbers[0];

        // Iterate through the array to find the largest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        // Print the largest element
        System.out.println("The largest element in the array is: " + largest);
    }

    
}
