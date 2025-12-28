package Week02_Saturday_Special;

// 3. Count Frequency of Each Digit

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num =sc.nextInt();
        int org = num;



        while(num!=0){
            int digit = num%10;
            int count = 0;
            int temp = org;
            while(temp!=0){
                if(temp%10 == digit){
                    count++;
                }
                temp/=10;
            }
            System.out.println(digit+":"+count);
            num/=10;
        }


    }
}
