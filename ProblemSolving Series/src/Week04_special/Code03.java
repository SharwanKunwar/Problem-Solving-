package Week04_special;

// Prime Factorization (Print Prime Factors)

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int i=2; i<=num; i++) {
            while(num%i != 0){
                System.out.println(i+"catched!!");
                num/=i;
            }
        }
        System.out.println("All primes are catched");
    }
}
