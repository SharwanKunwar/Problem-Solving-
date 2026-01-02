package Week03_special;

/*
    Title : Check whether a string is palindrome
    Problem statement:
    Check if a string reads the same forward and backward.
 */

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your word so that i can find \npalindrome or not: ");
        String word = sc.next();

        String org= word;
        String reversedWord = "";

        for(int i=word.length()-1; i>=0; i--){
            reversedWord+=word.charAt(i);
        }

        if(org.equals(reversedWord)) System.out.println("This is palindrome");
        else System.out.println("not palindrome");
    }
}
