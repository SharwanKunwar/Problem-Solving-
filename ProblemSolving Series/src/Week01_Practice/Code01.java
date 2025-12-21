package Week01_Practice;

import java.util.Scanner;

//This program generates a Fibonacci sequence up to a given number of terms and calculates the sum of even-valued Fibonacci numbers.

public class Code01 {
    static void main(String[] args) {

        int a = 0, b = 1, hold = 0, sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int num = sc.nextInt();



        for(int i=0; i<num; i++){

            if(a%2 == 0){
                sum+=a;
            }

            hold = a+b;
            a = b;
            b = hold;

        }
        System.out.println(sum);

    }
}
