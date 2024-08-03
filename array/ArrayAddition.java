import java.util.Scanner;

public class ArrayAddition {

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
            System.out.print( + (i + 1) );
            numbers[i] = scanner.nextInt();
        }

        // Print the elements of the array
        System.out.println("The elements in the array are:");
        for (int num : numbers) {
            System.out.println(num);
        }

        
    }
}
