package Week03_special;

/*
    Title : Check whether a string is palindrome without using extra space.
    Problem statement:
    Check if a string reads the same forward and backward.
 */

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word : ");
        String str = sc.next().toLowerCase();
        boolean isPalindrome = true;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)) {
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome) System.out.println("Yes this word is palindrome word");
        else System.out.println("Not a Palindrome");
    }
}
