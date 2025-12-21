package Week01_Practice;

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num = sc.nextInt();

        int result = fib(num);
        System.out.println(result);

    }
    static int fib(int x){
        int a = 0, b= 1, hold = 0;
        for(int i=0; i<x; i++){
            hold = a+b;
            a = b;
            b = hold;
        }
        return hold;
    }
}
