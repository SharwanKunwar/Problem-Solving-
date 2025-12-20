package Week01_SaturdaySpecial;

import java.util.Scanner;

public class SmallestDigit {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num  = sc.nextInt();
        int smallestNumber = 9;

        for(; num!=0; num/=10){
            int hold = num%10;
            if(hold < smallestNumber){
                smallestNumber = hold;
            }
        }
        System.out.println("The smallest number is : "+smallestNumber);

    }
}
