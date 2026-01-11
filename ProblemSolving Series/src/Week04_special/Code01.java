package Week04_special;

/*
1️⃣ Fibonacci Series – Sum of Even-Valued Terms
 */

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        int a = 0, b = 1,evenFibSum = 0, next;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();


        for(int i=0; i<num; i++){
            next = a+b;
            a = b;
            b = next;

            if(a%2 == 0){
                evenFibSum +=a;
            }
        }
        System.out.println("The sum is : "+evenFibSum);

    }
}
