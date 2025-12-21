package Day09;

/*  Count Digits Until Single Digit

    Problem Statement:
                Take a number and repeatedly sum its digits until the result becomes a single digit.
                Also count how many times the loop runs.
 */

import java.util.Scanner;

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;

        while(num>=10){

            int sum = 0;

            while (num!=0){
                sum+=num%10;
                num/=10;
            }
            System.out.println("The sum is : "+sum);
            num=sum;
            count++;

        }

        System.out.println("Single digit = " + num);
        System.out.println("Loop count = " + count);


    }
}
