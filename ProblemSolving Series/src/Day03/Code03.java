package Day03;

import java.util.Scanner;

// Check palindrome string
// This program checks whether a given word is a palindrome or not.

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input

        System.out.println("Enter your word: ");
        String str = sc.next(); // Read the word from user

        StringBuilder reversedString = new StringBuilder(); // Create StringBuilder to store reversed string

        // Loop from last character to first character of the input string
        for(int i = str.length() - 1; i >= 0; i--){
            reversedString.append(str.charAt(i)); // Append each character to reversedString
        }

        // Compare original string with reversed string
        // contentEquals works with StringBuilder (CharSequence) as well
        if(str.contentEquals(reversedString)){
            System.out.println("yes, given word is palindrome."); // If same, it is a palindrome
        } else {
            System.out.println("no, given word is not palindrome."); // If different, not a palindrome
        }

        sc.close(); // Close Scanner to prevent resource leak
    }
}
