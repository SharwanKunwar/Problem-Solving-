package Day06;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int org = num;
        int sumFactrol = 0;

        while(num != 0){
            int hold = num%10;
            int factorial = 1;
            for(int i=1; i<=hold; i++){
                factorial*=i;
            }
            sumFactrol+=factorial;
            num/=10;
        }
        if(org == sumFactrol){
            System.out.println("This is a strong number");
        }else {
            System.out.println("This is not a strong number");
        }
    }
}
