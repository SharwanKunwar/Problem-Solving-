package Day09;

import java.util.Scanner;

// Sum Until User Enters 0

public class Code04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("Enter your number : ");
            int num = sc.nextInt();

            if(num == 0){
                break;
            }
            sum+=num;
        }

        System.out.println("The sum is : "+sum);

    }
}
