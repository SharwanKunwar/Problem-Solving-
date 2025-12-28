package Week02_Saturday_Special;

import java.util.Scanner;

public class Code04 {
    static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int place = 1;
        int numNumber = 0;

        while(num!=0){
            int digit = num%10;
            if(digit == 0) digit = 1;

            numNumber=numNumber+digit*place;
            place*=10;
            num/=10;
        }
        System.out.println(numNumber);
    }

}
