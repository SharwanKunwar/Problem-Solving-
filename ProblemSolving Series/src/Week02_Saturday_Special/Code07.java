package Week02_Saturday_Special;

import java.util.Scanner;

public class Code07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;

        while(num!=0){
            int digit= num%10;
            if(digit != 0) break;
            count++;
            num/=10;
        }
        System.out.println("The repeated zero count is : "+count);
        sc.close();
    }
}
