package Week02_Saturday_Special;

// 2. Find the Largest Digit in a Number

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int max = 0;

        while(num!=0){
            int temp = num%10;
            if(temp > max){
                max = temp;
            }
            num/=10;
        }
        System.out.println("The max is : "+max);
    }
}
