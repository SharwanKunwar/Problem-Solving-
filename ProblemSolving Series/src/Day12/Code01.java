package Day12;

// Search an Element in an Array (Linear Search)

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {3,4,5,9,6,8,2};
        System.out.println("Enter number for search : ");
        int num = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.println("Number "+num+" is found at index "+i);
                break;
            }
        }

    }

}
