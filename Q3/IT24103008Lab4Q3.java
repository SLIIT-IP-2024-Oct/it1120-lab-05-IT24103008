import java.util.Scanner;

public class IT24103008Lab4Q3 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        
        // Read the input number
        int number = scanner.nextInt();

        // Use the ternary operator to check if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive." :
                        (number < 0) ? "The number is Negative." : 
                        "The number is Zero.";

        // Display the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
