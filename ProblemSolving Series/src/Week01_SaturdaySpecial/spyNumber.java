package Week01_SaturdaySpecial;

import java.util.Scanner;

public class spyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int sum=0, prod = 1;

        while(num!=0){
            int hold = num%10;
            sum+=hold;
            prod*=hold;
            num/=10;
        }
        if(sum == prod) System.out.println("This number is spy number");
        else System.out.println("This number is not spy number.");
    }
}
