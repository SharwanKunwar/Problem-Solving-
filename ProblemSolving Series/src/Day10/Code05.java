package Day10;

//✅ Problem 5: Decimal to Binary (Manual)
//
//Problem Statement:
//Convert a decimal number to binary without using arrays or built-in functions.


import java.util.Scanner;

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;

        while(num>0){
            int rem = num%2;
            binary = binary + rem * place;
            place*=10;
            num/=2;
        }
        System.out.println("The binary is : "+binary);

    }
}
