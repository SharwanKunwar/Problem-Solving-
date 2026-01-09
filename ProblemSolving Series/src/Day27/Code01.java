package Day27;

/*
🧩 Title: Check if Two Strings are Isomorphic

📌 Problem Statement:
Two strings s1 and s2 are isomorphic if the characters in s1 can be replaced to get s2
while preserving the order. No two characters should map to the same character.
*/

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1 = sc.next();
        System.out.println("Enter second string:");
        String s2 = sc.next();

        // Step 1: Check length
        if (s1.length() != s2.length()) {
            System.out.println("Not isomorphic (different lengths)");
            return;
        }

        boolean isIsomorphic = true;

        // Step 2: Check mapping from s1 -> s2
        for (int i = 0; i < s1.length(); i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            // Check if ch1 has appeared before and maps to same ch2
            for (int j = 0; j < i; j++) {
                if (s1.charAt(j) == ch1 && s2.charAt(j) != ch2) {
                    isIsomorphic = false;
                    break;
                }
                if (s1.charAt(j) != ch1 && s2.charAt(j) == ch2) {
                    isIsomorphic = false;
                    break;
                }
            }
            if (!isIsomorphic) break;
        }

        // Step 3: Print result
        if (isIsomorphic) {
            System.out.println("Yes, strings are isomorphic");
        } else {
            System.out.println("Not isomorphic");
        }

        sc.close();
    }
}
