package Week01_SaturdaySpecial;

import java.util.Scanner;

public class FibonacciSeriesEvenSum {
    static void main(String[] args) {
        int a = 0, b = 1, sum=0, next;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int i=1; i<num; i++){
            next = a+b;
            a = b;
            b = next;
            System.out.println(a);
            if(next%2 == 0){
                sum+=next;
            }
        }
        System.out.println("The sum fibonacci even number is : "+sum);
    }
}
