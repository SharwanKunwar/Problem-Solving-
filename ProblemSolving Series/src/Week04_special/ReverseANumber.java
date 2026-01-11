package Week04_special;

// reverse a number.

import java.util.Scanner;

public class ReverseANumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int rev = 0;

        // for loop
        for(; num!=0; num/=10){
            rev = rev*10+num%10;
        }
        System.out.println("The reversed number is : "+rev);
    }
}
