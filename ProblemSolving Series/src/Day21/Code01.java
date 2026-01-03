package Day21;

/*
   Title: Reverse Each Word in a Sentence

   Problem Statement:
   Given a sentence, reverse each word individually
   without changing the word order.

   Example:
   Input : Java is fun
   Output: avaJ si nuf
*/

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {

        // Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Taking full sentence input
        System.out.println("Enter your string : ");
        String str = sc.nextLine();

        // 'result' will store final output
        // 'word' will temporarily store characters of one word
        String result = "";
        String word = "";

        // Traverse through each character of the string
        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // If character is NOT space, keep building the word
            if(ch != ' ') {
                word += ch;
            }
            // If space is found, reverse the collected word
            else {
                // Reverse the current word
                for(int j = word.length() - 1; j >= 0; j--) {
                    result += word.charAt(j);
                }

                // Add space after reversed word
                result += " ";

                // Reset word for next iteration
                word = "";
            }
        }

        // Reverse and add the last word (no space after it)
        for(int j = word.length() - 1; j >= 0; j--) {
            result += word.charAt(j);
        }

        // Print the final result
        System.out.println(result);
    }
}
