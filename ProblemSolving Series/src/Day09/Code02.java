package Day09;

// Write a program to find out whether a given integer is present in an array or not.

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {21,2,3,4,5,6};
        boolean isPresent = false;

        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        for(int val:arr){

            if (num == val) {
                isPresent = true;
                break;
            }

        }

        if(isPresent) System.out.println("The number is present in array.");
        else System.out.println("The number is not present in array.");

    }
}
