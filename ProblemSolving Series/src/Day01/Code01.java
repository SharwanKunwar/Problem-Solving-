package Day01;

import java.util.Scanner;

public class Code01 {


    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Variables for Fibonacci calculation
        int a = 0, b = 1, next;
        int sum = 0;

        // Asking user for the number of Fibonacci terms
        System.out.print("Enter the number > 0 && < 100 : ");
        int size = sc.nextInt();

        // Generate Fibonacci series and calculate sum of even-valued terms
        for (int i = 0; i < size; i++) {
            next = a + b;   // Next Fibonacci number
            a = b;          // Update first number
            b = next;       // Update second number

            // Check if the number is even and add to sum
            if (next % 2 == 0) {
                sum += next;
            }
        }

        // Display the final sum of even Fibonacci numbers
        System.out.println("Sum of even-valued Fibonacci terms: " + sum);
    }
}
