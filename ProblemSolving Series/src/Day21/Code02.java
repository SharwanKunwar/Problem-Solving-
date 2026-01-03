package Day21;

/*
    2️⃣ Check Anagram Strings Problem Statement:
    Check whether two strings are anagrams (contain same characters with same frequency).
*/

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.next().toLowerCase();

        System.out.print("Enter second word: ");
        String word2 = sc.next().toLowerCase();

        // Step 1: Length check
        if(word1.length() != word2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        // Step 2: Frequency array for 26 letters
        int[] freq = new int[26];

        // Count characters of first word
        for(int i = 0; i < word1.length(); i++) {
            freq[word1.charAt(i) - 'a']++;
        }

        // Subtract characters of second word
        for(int i = 0; i < word2.length(); i++) {
            freq[word2.charAt(i) - 'a']--;
        }

        // Step 3: Check frequency array
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                System.out.println("Not an Anagram");
                return;
            }
        }

        System.out.println("Anagram");
    }
}
