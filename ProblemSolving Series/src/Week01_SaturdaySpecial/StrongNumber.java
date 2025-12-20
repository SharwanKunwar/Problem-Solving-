package Week01_SaturdaySpecial;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;
        int sum = 0;

        for(; num!=0; num/=10){
            int hold = num%10;
            int fact = 1;
            for(int i=1; i<=hold; i++){
                fact*=i;
            }
            sum+=fact;
        }

        if(org == sum) System.out.println("This number is strong.");
        else System.out.println("This number is not strong");


    }
}
