package Day01;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt(); // The unlucky victim number

        // Start hunting from the smallest prime minion 😎
        for(int i=2; i<=num; i++){
            // Keep catching this factor until it's gone
            while(num % i == 0){
                System.out.println(i + " Catched!! 💀"); // Factor caught, no escape
                num /= i; // Reduce the victim by the factor, continue the hunt
            }
        }

        // All prime enemies revealed! 🎉
        System.out.println("All prime minions exposed! 😈");
    }
}
