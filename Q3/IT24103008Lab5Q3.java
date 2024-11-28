import java.util.Scanner;

public class IT24103008Lab5Q3 {
    
    // Constants
    public static final int ROOM_CHARGE_PER_DAY = 48000;
    public static final int MIN_DATE = 1;
    public static final int MAX_DATE = 31;
    public static final int DISCOUNT_3_TO_4_DAYS = 10;
    public static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the start and end dates of the reservation
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();
        
        // Validate the input
        if (startDate < MIN_DATE || startDate > MAX_DATE || endDate < MIN_DATE || endDate > MAX_DATE) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return; // Exit the program
        }
        
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return; // Exit the program
        }

        // Calculate the number of days reserved
        int numberOfDays = endDate - startDate ;
        
        // Apply the discount based on the number of days reserved
        double discount = 0;
        if (numberOfDays >= 5) {
            discount = DISCOUNT_5_OR_MORE_DAYS;
        } else if (numberOfDays >= 3) {
            discount = DISCOUNT_3_TO_4_DAYS;
        }

        // Calculate the total amount
        double totalAmount = numberOfDays * ROOM_CHARGE_PER_DAY;
        
        // Apply discount to the total amount if applicable
        double discountAmount = (totalAmount * discount) / 100;
        totalAmount -= discountAmount;

        // Output the results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Discount applied: " + discount + "%");
        System.out.println("Total amount to be paid: Rs " + totalAmount);

        // Close the scanner
        scanner.close();
    }
}
