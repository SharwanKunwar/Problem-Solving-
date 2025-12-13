package Practice;

// print Fibonacci series and hold sum of even valued numbers.

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1, next = 0;
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int i=0; i<num; i++){
            next = a+b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}
