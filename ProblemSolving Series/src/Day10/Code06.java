package Day10;

// binary to decimal

import java.util.Scanner;

public class Code06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;
        int org = num;
        int holdResult = 0;

        while(num!=0){
            num/=10;
        }

        num = org;


        while(num!=0){
            int digit = num%10;
            holdResult +=(digit*(int) Math.pow(2,count));
            count++;
            num/=10;
        }
        System.out.println("decimal is: "+holdResult);




    }
}
