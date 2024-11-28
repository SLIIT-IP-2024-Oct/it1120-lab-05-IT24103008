import java.util.Scanner;

public class IT24103008Lab5Q2 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of new members introduced
        System.out.print("Enter the number of new members you have introduced: ");
        int newMembers = scanner.nextInt();

        // Validate the input to ensure the number is non-negative
        if (newMembers < 0) {
            System.out.println("Invalid input! The number of new members cannot be negative.");
        } else {
            // Use a switch statement to determine the prize based on the number of new members
            String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Output the prize the customer is entitled to
            System.out.println("You are entitled to a: " + prize);
        }

        // Close the scanner
        scanner.close();
    }
}
