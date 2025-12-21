package Week01_Practice;

import java.util.Scanner;

public class ReverseDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int rev = 0;
        int org = num;
        int rev1 = 0;

        while(num != 0){
            rev = (rev*10)+(num%10);
            num/=10;
        }

        for(; org != 0; org/=10){
            rev1 = rev1 *10 + org%10;
        }
        System.out.println(rev);
        System.out.println(rev1);
    }
}
