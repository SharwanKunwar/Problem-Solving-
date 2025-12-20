package Day08;

import java.util.Scanner;

// Program to find the largest digit in a number


public class Code02 {
    public static void main(String[] args) {

        // Scanner object: the only friend that actually listens to user input
        Scanner sc = new Scanner(System.in);

        // Politely asking the user for a number (we trust them… for now)
        System.out.print("Enter your digit : ");
        int num = sc.nextInt();

        // Saving the original number before we brutally destroy it digit by digit
        int org = num;

        // Starting with 0 because confidence matters, but facts matter more
        int holdLargestNum = 0;

        // Loop runs until the number has no digits left to defend itself
        for(; num != 0; num /= 10){

            // Extracting the last digit like an interrogation
            int temp = num % 10;

            // If this digit is bigger, it takes the throne
            if(temp > holdLargestNum) {
                holdLargestNum = temp;
            }
        }

        // Announcing the winner of the digit survival contest
        System.out.println(
                "The largest digit of '" + org + "' is : " + holdLargestNum
        );

        // Closing the scanner because open resources cause trust issues
        sc.close();
    }
}
