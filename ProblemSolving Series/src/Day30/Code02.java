package Day30;

/*
1️⃣ Longest Palindromic Substring (Basic Logic)
Problem Statement

Given a string, find the longest palindromic substring.

Example
Input:  babad
Output: bab


📌 Hint:
Check palindrome from every index
Expand left & right
 */

public class Code02 {
    static void main(String[] args) {

        String str = "babad";
        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < str.length(); i++) {

            // Odd length palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < str.length()
                    && str.charAt(left) == str.charAt(right)) {

                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }

            // Even length palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < str.length()
                    && str.charAt(left) == str.charAt(right)) {

                int len = right - left + 1;
                if (len > maxLen) {
                    maxLen = len;
                    start = left;
                }
                left--;
                right++;
            }
        }

        // Print palindrome manually
        System.out.print("Longest Palindromic Substring: ");
        for (int i = start; i < start + maxLen; i++) {
            System.out.print(str.charAt(i));
        }

    }
}
