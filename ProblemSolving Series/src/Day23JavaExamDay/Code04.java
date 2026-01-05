package Day23JavaExamDay;

/*
    Write a java program to swap two number in the following two ways:
    1. using a third variable.
    2. without using third variable.
 */

import java.util.Scanner;

public class Code04 {
    static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a : ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        swap2(a,b);


    }
    static void swap1(int x, int y){

        System.out.println("before swap x: "+x+" y: "+y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("after swap x: "+x+" y: "+y);
    }
    static void swap2(int x,int y){
        System.out.println("before swap x: "+x+" y: "+y);
        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println("after swap x: "+x+" y: "+y);
    }
}
