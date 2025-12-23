package Day11;

// Print All Element of an Array
// Problem statement:
/*
    Take n element from the user and print all elements of the array in the same order.
 */

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter your "+i+"th element : ");
            int hold = sc.nextInt();
            arr[i] = hold;
        }

        for(int val:arr){
            System.out.print(val+" ");
        }

    }
}
