package Week01_SaturdaySpecial;

import java.util.Scanner;

public class largestDigti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
        int num = sc.nextInt();
        int largestNumber = 0;

        while(num!=0){
            int temp = num%10;
            if(temp > largestNumber) largestNumber = temp;
            num/=10;
        }
        System.out.println("The largest number is : "+largestNumber);

    }
}
