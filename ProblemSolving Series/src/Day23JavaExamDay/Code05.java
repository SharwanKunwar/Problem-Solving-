package Day23JavaExamDay;

/*
Write a Java program that accepts three integers from the user using the Scanner class and determines:
1. The largest number
2. The smallest number
👉 Both the largest and smallest values must be found using the ternary operator.
 */

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Enter the value of a: ");
        a = sc.nextInt();

        System.out.println("Enter the value of b: ");
        b = sc.nextInt();

        System.out.println("Enter the value of c: ");
        c = sc.nextInt();

        int largest = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);
        int smallest = (a <= b) ? ((a <= c) ? a : c) : ((b <= c) ? b : c);

        System.out.println("largest : "+largest);
        System.out.println("smallest : "+smallest);
        sc.close();



    }
}
