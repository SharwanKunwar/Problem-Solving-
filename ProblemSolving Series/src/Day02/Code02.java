package Day02;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {

        // Scanner object: because mind reading user input is still not possible
        Scanner sc = new Scanner(System.in);

        // Asking the user for a number (politely)
        System.out.print("Enter your Digit: ");
        int digit = sc.nextInt();

        // sum will store the final result, starts from zero because math
        int sum = 0;

        // If user enters a negative number, we ignore the minus sign
        // (we want digits, not emotional negativity)
        digit = Math.abs(digit);

        // Loop runs until there are no digits left to torture
        while (digit != 0) {

            // Taking the last digit (digit says goodbye here)
            sum += digit % 10;

            // Removing the last digit (digit loses weight)
            digit /= 10;
        }

        // Finally showing the result
        System.out.println("The sum is : " + sum);

        // Closing scanner because we are responsible developers
        sc.close();
    }
}
