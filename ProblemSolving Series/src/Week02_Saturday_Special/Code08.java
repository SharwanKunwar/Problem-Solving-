package Week02_Saturday_Special;

import java.util.Scanner;

public class Code08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        }else{
            for(int i=2; i*i<=num; i++){
                if(num%i == 0){
                    isPrime = false;
                }
            }
        }
        if(isPrime) System.out.println("Prime");
        else System.out.println("not Prime");
    }
}
