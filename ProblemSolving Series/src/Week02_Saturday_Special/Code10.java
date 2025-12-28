package Week02_Saturday_Special;

import java.util.Scanner;

public class Code10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your binary number : ");
        int num = sc.nextInt();
        int decimal = 0, power = 0;

        while(num!=0){
            int digit = num%10;
            decimal  += digit * (int) Math.pow(2,power);
            power++;
            num/=10;

        }
        System.out.println("decimal : "+decimal);
    }
}
