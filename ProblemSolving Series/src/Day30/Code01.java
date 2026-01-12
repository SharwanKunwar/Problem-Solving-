package Day30;

//## 1️⃣ Fibonacci Series – Sum of Even-Valued Terms

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        // creating scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // initializing first two fibonacci numbers
        int a = 0, b =1 , next;

        // variable to store sum of even fibonacci numbers
        int sum = 0;

        // asking user for number of terms
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        // loop to generate fibonacci series up to num terms
        for(int i=0; i<num; i++){
            //calculating next fibonacci number
            next = a+b;

            //shifting values for next iteration
            a = b;
            b = next;

            // printing the current fibonacci number
            System.out.println(a);

            // checking if the fibonacci number is even
            if(a%2 == 0){
                // adding even fibonacci nubmer to sum
                sum+=a;
            }
        }

        // printing the sum of even fibonacci numbers
        System.out.println("\n\n The sum of even fibonacci is : "+sum);

    }
}
