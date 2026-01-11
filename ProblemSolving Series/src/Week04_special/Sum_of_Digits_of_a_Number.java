package Week04_special;

// Sum of Digits of a Number

import java.util.Scanner;

public class Sum_of_Digits_of_a_Number {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum= 0;

        // while
        while(num!=0){
            int digit = num%10;
            sum+=digit;
            num/=10;
        }
        System.out.println("The sum of a digit of a number is : "+sum);
    }
}
