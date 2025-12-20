package Week01_SaturdaySpecial;

import java.util.Scanner;

public class NeonNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum =0;


        int square = num*num;

        while(square!=0){
            int hold = square%10;
            sum+=hold;
            square/=10;
        }

        if(num == sum) System.out.println("This is neon number");
        else System.out.println("This is not a neon number");
    }
}
