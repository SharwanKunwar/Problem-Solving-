package Week01_SaturdaySpecial;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;

        while(num!=0){
            int digit = num%10;
            int count =0;

            int temp = org;
            while(temp!=0){
                if(temp%10 == digit) count++;
                temp/=10;
            }
            System.out.println(digit+" : "+count);
            num/=10;
        }
    }
}
