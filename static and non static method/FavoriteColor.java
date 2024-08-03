
    import java.util.Scanner; // Import the Scanner class

public class FavoriteColor {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine(); // Read the color input from the user

        // Display the entered color
        System.out.println("Your favorite color is " + color + ".");

        
    }
}


