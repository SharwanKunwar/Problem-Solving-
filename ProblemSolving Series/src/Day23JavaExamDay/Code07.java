package Day23JavaExamDay;

/*
Write a Java program that accepts two integers from the user using the Scanner class and performs the following bitwise operations on them:

* Bitwise AND (&)
* Bitwise OR (|)
* Bitwise XOR (^)
* Bitwise NOT (~)
* Left Shift (<<)
* Right Shift (>>)

The program should display the result of each operation.
 */

import java.util.Scanner;

public class Code07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.print("Enter the value of a : ");
        a= sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();

        // Bitwise AND (&)
        System.out.println("Bitwise And (&) : "+(a&b));

        // Bitwise OR (|)
        System.out.println("Bitwise OR (|) : "+(a|b));

        // Bitwise XOR(^)
        System.out.println("Bitwise XOR (^) : "+(a^b));

        // Bitwise NOT (~)
        System.out.println("Bitwise NOT (~a) : "+(~a));
        System.out.println("Bitwise NOT (~b) : "+(~b));

        //left shift(<<)
        System.out.println("left shift (<<) : "+(a<<1));
        System.out.println("left shift (<<) : "+(b<<1));

        //right shift(>>)
        System.out.println("left shift (>>) : "+(a>>1));
        System.out.println("left shift (>>) : "+(b>>1));



    }
}
