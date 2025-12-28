
package Week02_Saturday_Special;

//1. Find the Smallest Digit in a Number


import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();
        int min = 9;

        while(num!=0){
            int temp = num%10;
            if(temp < min){
                min=temp;
            }
            num/=10;
        }

        System.out.println("The min is : "+min);


    }
}
