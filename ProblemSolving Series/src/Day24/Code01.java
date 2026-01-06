package Day24;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,b=1,next;

        System.out.println("Enter the number: ");
        int size = sc.nextInt();

        for(int i=0; i<size; i++){
            next = a+b;
            a= b;
            b=next;
            System.out.println(a);
        }
    }
}
