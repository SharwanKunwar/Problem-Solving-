package Week01_SaturdaySpecial;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        for(; num!=0; num/=10){
            rev = (rev*10)+(num%10);
        }

        if(org == rev) System.out.println("Entered number is palindrome number");
        else System.out.println("Entered number is not a palindrome number");




    }
}
