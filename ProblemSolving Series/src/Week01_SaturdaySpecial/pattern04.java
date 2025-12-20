package Week01_SaturdaySpecial;

import java.util.Scanner;

public class pattern04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number ; ");
        int num = sc.nextInt();

        for(int i=num; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
