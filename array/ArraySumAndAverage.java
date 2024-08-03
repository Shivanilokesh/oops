import java.util.Scanner;

public class ArraySumAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of size n
        int[] numbers = new int[n];

        // Read the elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int average = (int) sum / n;

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

       
    }
}
