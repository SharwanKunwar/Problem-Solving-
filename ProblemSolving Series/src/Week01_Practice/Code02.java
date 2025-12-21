package Week01_Practice;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(num <= 1){
            isPrime = false;
        }else{
            for(int i=2; i<num; i++){
                if(num%i == 0){
                    isPrime = false;
                }
            }
        }

        if(isPrime) System.out.println("The number is prime");
        else System.out.println("The number is not prime");


    }
}
