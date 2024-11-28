import java.util.Scanner;

public class IT24103008Lab4Q2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Input exam marks and validate
        System.out.print("Enter the exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input! Exam marks must be between 0 and 100.");
            return;  // Exit the program if the input is invalid
        }

        // Input lab submission marks and validate
        System.out.print("Enter the lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input! Lab submission marks must be between 0 and 100.");
            return;  // Exit the program if the input is invalid
        }

        // Input percentage weights for exam and lab marks and validate
        System.out.print("Enter the percentage weight for exam marks: ");
        double examPercentage = scanner.nextDouble();
        if (examPercentage < 0 || examPercentage > 100) {
            System.out.println("Invalid input! Exam percentage must be between 0 and 100.");
            return;  // Exit the program if the input is invalid
        }

        System.out.print("Enter the percentage weight for lab submission marks: ");
        double labPercentage = scanner.nextDouble();
        if (labPercentage < 0 || labPercentage > 100) {
            System.out.println("Invalid input! Lab percentage must be between 0 and 100.");
            return;  // Exit the program if the input is invalid
        }

        // Validate that percentages add up to 100
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid input! The sum of the percentages should be 100.");
            return;  // Exit the program if the percentages don't add up to 100
        } else {
            // Calculate the final mark
            double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

            // Output the final mark
            System.out.println("The final mark for the module is: " + finalMark);
        }

        // Close the scanner
        scanner.close();
    }
}
