package Day22;

import java.util.Scanner;

/*
    🧩 Title: Longest Palindromic Substring (Basic Version)
📌 Problem Statement

Given a string, find the longest substring that is a palindrome.

A substring is a continuous part of a string.
 */

public class Code01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string : ");
        String str = sc.nextLine();
        int strLength = str.length();
        String longestPalindrome = "";

        for(int i=0; i<str.length(); i++){
            String subString = "";

            for(int j=i; j<str.length(); j++){
                subString+=str.charAt(j);
                if(isPalindrome(subString) && subString.length() > longestPalindrome.length()) longestPalindrome = subString;
            }
        }
        System.out.println("The longest palindrome subString is : "+longestPalindrome);
    }
    static boolean isPalindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
