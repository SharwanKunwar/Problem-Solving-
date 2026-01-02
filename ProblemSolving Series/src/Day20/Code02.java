package Day20;

// wap to test given number is positive or negative or zero

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        if(num < 0){
            System.out.println("Negative");
        }else if(num > 0){
            System.out.println("positive");
        }else{
            System.out.println("Zero");
        }
    }
}
