package Day08;

// Compare reverse of two numbers

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Taking first number input
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();

        // Taking second number input
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        // Variables to store reversed numbers
        int rev01 = 0;
        int rev02 = 0;

        // Reverse num1
        while (num1 != 0) {
            rev01 = rev01 * 10 + num1 % 10; // extract last digit and append
            num1 /= 10; // remove last digit
        }

        // Reverse num2
        while (num2 != 0) {
            rev02 = rev02 * 10 + num2 % 10; // extract last digit and append
            num2 /= 10; // remove last digit
        }

        // Compare reversed numbers
        if (rev01 == rev02)
            System.out.println("Same after reverse");
        else
            System.out.println("Not same after reverse");

        // Close scanner to free resources
        sc.close();
    }
}
