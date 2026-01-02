package Day20;

// write a java program to find the second-largest number among three input number using else if ladder statement.

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st value : ");
        a = sc.nextInt();
        System.out.print("Enter your 2nd value : ");
        b = sc.nextInt();
        System.out.print("Enter your 3rd value: ");
        c = sc.nextInt();

        if(a>=b && a >=c){
            System.out.println("A is greater which value is : "+a);
        }else if(b>=a && b>=c){
            System.out.println("B is greater which value is : "+b);
        }else{
            System.out.println("C is greater which value is : "+c);
        }
    }

}
