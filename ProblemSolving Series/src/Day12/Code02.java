package Day12;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = {1,2,3,4,1,5,6,1};
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;

        for(int val:arr){
            if(num == val){
                count++;
            }
        }
        System.out.println("The number "+num+" is appears "+count+" times.");


    }
}
