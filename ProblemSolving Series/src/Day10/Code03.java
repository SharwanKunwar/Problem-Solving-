package Day10;

//Count Trailing Zeros

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int count = 0;

        while(num!=0) {
            if(num%10 == 0){
                count++;
            }else{
                break;
            }
            num/=10;
        }
        System.out.println("The zero count is : "+count);

    }
}
