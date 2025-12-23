package Day11;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int val:arr){
            sum+=val;
        }
        System.out.println("The sum of all element of array is : "+sum);
    }
}
