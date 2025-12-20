package Week01_SaturdaySpecial;

import java.util.Scanner;

public class PrimeFactorization {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        for(int i=2; i<=num; i++){
            while (num%i == 0){
                System.out.println(i);
                num/=i;
            }

        }
    }
}
