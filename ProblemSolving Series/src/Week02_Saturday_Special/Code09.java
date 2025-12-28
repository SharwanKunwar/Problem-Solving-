package Week02_Saturday_Special;

//Decimal to Binary

import java.util.Scanner;

public class Code09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your nubmer : ");
        int num = sc.nextInt();
        int binary = 0, place = 1;

        while(num > 0){
            int digit = num%2;
            binary = binary+digit*place;
            place*=10;
            num/=2;
        }

        System.out.println("The binary is : "+binary);


    }
}
