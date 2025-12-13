package Practice;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int hold = fib(num);
        System.out.println(hold);


    }
    static int fib(int num){
        if(num == 0) return 0;
        if(num == 1) return 1;
        return fib(num-1)+fib(num-2);
    }
}
