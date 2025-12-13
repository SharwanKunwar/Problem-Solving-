package Day01;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int Num = sc.nextInt();

        boolean isPrime = true;

        if(Num <= 1){
            isPrime = false; // Too young or too old, no prime glory for you 😆
        } else {
            for(int i = 2; i*i <= Num; i++){ // Start hunting for enemies
                if(Num % i == 0){
                    isPrime = false; // Caught red-handed divisible! Death sentence 🫣
                    break;
                }
            }
        }

        if(isPrime){
            System.out.println("prime 🎉"); // Survived the divisibility trap, king of numbers!
        } else {
            System.out.println("not prime 😭"); // Alas! Betrayed by a sneaky factor...
        }
    }
}
