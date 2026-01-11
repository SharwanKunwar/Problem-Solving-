package Week04_special;

import java.util.Scanner;

public class Palindrome_Number_Check {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;
        int rev = 0;

        // while
        while (num!=0){
            rev = rev*10+num%10;
            num/=10;
        }

        if(org == rev){
            System.out.println("The is palindrome");
        }else {
            System.out.println("The number is not an plaindrome");
        }
    }
}
