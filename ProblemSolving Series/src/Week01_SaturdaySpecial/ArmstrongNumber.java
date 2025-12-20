package Week01_SaturdaySpecial;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;
        int count = 0;
        int sum = 0;

        for(; num!=0; num/=10){
            count++;
        }

        num = org;

        while(num !=0){
            int holdDigit = num%10;
            sum += (int) Math.pow(holdDigit,count);
            num/=10;
        }

        if(org == sum) System.out.println("This is Armstrong number.");
        else System.out.println("This is not Armstrong number.");
    }
}
