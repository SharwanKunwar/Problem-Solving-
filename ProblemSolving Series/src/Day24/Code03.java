package Day24;

// WAP to find Fibonacci series using recursive and non-recursive function

import java.util.Scanner;

public class Code03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        System.out.println("\nNon-Recursive Fibonacci Series:");
        fib1(num);

        System.out.println("\nRecursive Fibonacci Series:");
        for (int i = 0; i < num; i++) {
            System.out.println(fib2(i));
        }
    }

    // Non-recursive function
    static void fib1(int x) {
        int a = 0, b = 1, next;
        for (int i = 0; i < x; i++) {
            System.out.println(a);
            next = a + b;
            a = b;
            b = next;
        }
    }

    // Recursive function
    static int fib2(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return fib2(x - 1) + fib2(x - 2);
    }
}
