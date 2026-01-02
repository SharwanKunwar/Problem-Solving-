package Day20;

// write a java programto input two number and arithmetic operator from user and perform all arithmetic operation (+,-,*,/,%) using switch case statement.

import java.util.Scanner;

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter your first number : ");
        int num1 = sc.nextInt();
        System.out.print("what do you wanna do ( +, -, *, /, % ) : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter your second number : ");
        int num2 = sc.nextInt();

        switch (op){
            case '+':
                System.out.println(num1+"+"+num2+" = "+(num1+num2));
                break;

            case '-':
                System.out.println(num1+"-"+num2+" = "+(num1-num2));
                break;

            case '*':
                System.out.println(num1+"X"+num2+" = "+(num1*num2));
                break;

            case '/':
                System.out.println(num1+"/"+num2+" = "+(num1/num2));
                break;

            case '%':
                System.out.println(num1+"%"+num2+" = "+(num1%num2));
                break;

            default:
                System.out.println("Wrong input try again!!");
        }
    }
}
