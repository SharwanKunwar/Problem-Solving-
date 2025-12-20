package Week01_SaturdaySpecial;

import java.util.Scanner;

public class PrefectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i=1; i<num; i++){
            if(num%i == 0){
                sum+=i;
            }
        }

        if(num == sum) System.out.println("This is perfect number.");
        else System.out.println("This is not a perfect number.");





    }
}
