package Day08;

// Program to find the smallest digit in a number

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {

        // Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        // Initialize the smallest digit as 9
        // (because digits range from 0 to 9)
        int holdSmallestNum = 9;

        // Loop until number becomes 0
        while(num != 0){

            // Get last digit of the number
            int track = num % 10;

            // Print each digit (for understanding/debugging)
            System.out.println(track);

            // Compare and update smallest digit
            if(track < holdSmallestNum){
                holdSmallestNum = track;
            }

            // Remove last digit
            num /= 10;
        }

        // Print the smallest digit
        System.out.println("The smallest number is : " + holdSmallestNum);

        // Close scanner
        sc.close();
    }
}
