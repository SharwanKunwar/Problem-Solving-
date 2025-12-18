package Day06;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        int org = num;

        int holdSquare = num*num;
        int sum = 0;

        while(holdSquare != 0){
            int hold = holdSquare%10;
            sum+=hold;
            holdSquare/=10;
        }
        if(org == sum){
            System.out.println("neon number");
        }else {
            System.out.println("not neon number");
        }
    }
}
