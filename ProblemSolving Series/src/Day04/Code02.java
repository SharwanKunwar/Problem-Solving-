package Day04;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Ask user to enter a number
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        // Variable to store sum of proper divisors
        int mult = 0;

        // Loop from 1 to num-1 to find divisors
        for (int i = 1; i < num; i++) {

            // Check if i is a divisor of num
            if (num % i == 0) {
                mult += i;   // Add divisor to sum
            }
        }

        // Check whether the number is perfect or not
        if (num == mult) {
            System.out.println("This is a perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }
    }
}
