package Week04_special;

/*
2️⃣ Prime Number Check
 */

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);


        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        for(int i=2; i*i<=num; i++){
            if(num%i == 0){
                isPrime = false;
            }
        }
        if(isPrime) System.out.println("Yes prime ");
        else System.out.println("not prime");
    }
}
