package Day20;

// Write a java program to check input number is odd and divisible by three or even and divisible by three using nested if else statement.

import java.util.Scanner;

public class Code04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(num%2 == 0) if(num%3 == 0) System.out.println("Even and divisible by 3");
        else if(num%3 == 0) System.out.println("Odd and divisible by 3");

    }
}
