package Day24;

import java.util.Scanner;

// wap to calculate factorial of a given number.

public class Code02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int result = fact(num);
        System.out.println("The factorial is : "+result);


    }
    static int fact(int x){
        if(x==0) return 0;
        if(x==1) return 1;

        return x*fact(x-1);
    }
}
