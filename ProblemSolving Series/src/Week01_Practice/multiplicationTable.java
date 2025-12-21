package Week01_Practice;

import java.util.Scanner;

public class multiplicationTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+" = "+(num*i));
        }
    }
}
