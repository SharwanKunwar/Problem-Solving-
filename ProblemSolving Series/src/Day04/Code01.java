package Day04;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        // Store original number for comparison later
        int org = num;

        // Variables to store digit count and Armstrong sum
        int count = 0;
        int sum = 0;

        // Loop to count number of digits
        while (num != 0) {
            num /= 10;     // Remove last digit
            count++;       // Increase digit count
        }

        // Restore original number for Armstrong calculation
        num = org;

        // Loop to calculate sum of each digit raised to power count
        for (; num != 0; num /= 10) {
            int track = num % 10;               // Extract last digit
            sum += (int) Math.pow(track, count);      // Add digit^count to sum
        }

        // Check whether the number is Armstrong or not
        if (org == sum)
            System.out.println("The number " + org + " is Armstrong number");
        else
            System.out.println("The number " + org + " is not Armstrong number");
    }
}
