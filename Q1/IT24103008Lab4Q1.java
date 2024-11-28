import java.util.Scanner;

public class IT24103008Lab4Q1 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        int number = scanner.nextInt();

        // Check if the number is positive, negative or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        // Close the scanner
        scanner.close();
    }
}
