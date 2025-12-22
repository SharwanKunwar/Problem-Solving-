package Day10;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        while(num!=0){
           int digit = num%10;
            System.out.print(digit);
            num/=10;

        }

    }
}
