package Week02_Saturday_Special;

import java.util.Scanner;

// 5. Compare Reverse of Two Numbers

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter your second number : ");
        int num2 = sc.nextInt();

        int rev1 = 0;
        int rev2 = 0;

        while(num1!=0){
            rev1= rev1*10+num1%10;
            num1/=10;
        }
        while(num2!=0){
            rev2= rev2*10+num2%10;
            num2/=10;
        }

        if(rev1 == rev2) System.out.println("same");
        else System.out.println("not same");
    }
}
