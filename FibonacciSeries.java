// Import Scanner to handle user input
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // TODO: Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        // Boolean flag to allow the user to run the program multiple times
        boolean continueProgram = true;

        while (continueProgram) {
            int n; // Variable to store the number of Fibonacci terms

            // TODO: Create a loop to validate user input (ensure it's a positive integer)
            while (true) {
                System.out.print("Enter the number of Fibonacci terms to generate: ");

                // TODO: Check if user input is a valid integer
                if (sc.hasNextInt()) {
                    n = sc.nextInt(); /* Read user input */;
                    
                    // TODO: Ensure the input is non-negative
                    if (n >= 0) {
                        break; // Exit the loop if valid
                    } else {
                        System.out.println("Please enter a positive integer.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a valid number.");
                    sc.next();// TODO: Clear the invalid input
                }
            }

            // Handle special cases (N = 0 or N = 1)
            if (n == 0) {
                System.out.println("No Fibonacci numbers to display.");
            } else if (n == 1) {
                System.out.println("The first Fibonacci number is: 0");
            } else {
                // TODO: Print the first N Fibonacci numbers
                System.out.println("The first " + n + " Fibonacci numbers are:");

                int first = 0, second = 1; // Initialize Fibonacci sequence

                // TODO: Create a loop to generate and print the Fibonacci sequence

                for (int i = 0; i < n; i++) {
                                        
                }

        
