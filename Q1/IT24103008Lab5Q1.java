import java.util.Scanner;

public class  IT24103008Lab5Q1 {
    public static void main(String[] args) {
        // Create a scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        // Initialize the largest and smallest values to the first number
        int largest = num1;
        int smallest = num1;
        
        // Check the second number
        if (num2 > largest) {
            largest = num2;   
        }
        if (num2 < smallest) {
            smallest = num2;
        }
        
        // Check the third number
        if (num3 > largest) {
            largest = num3;
        }
        if (num3 < smallest) {
            smallest = num3;
        }
        
        // Output the results
        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
        
        // Close the scanner
        scanner.close();
    }
}
