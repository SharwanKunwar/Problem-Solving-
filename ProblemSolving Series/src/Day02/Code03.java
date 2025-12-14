package Day02;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {

        // Scanner for user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        // Negative numbers are not palindrome
        if (num < 0) {
            System.out.println("Negative numbers are not palindrome");
            sc.close();
            return;
        }

        int original = num;  // storing original number
        int rev = 0;

        // Reversing the number
        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        // Checking palindrome
        if (original == rev) System.out.println("The number " + original + " is a Palindrome number");
        else System.out.println("The number " + original + " is not a Palindrome number");

        //At this line number scanner is closed.
        sc.close();
    }
}
