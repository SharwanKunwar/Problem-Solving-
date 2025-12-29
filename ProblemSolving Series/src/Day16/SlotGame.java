package Day16;

import java.util.Scanner;

public class SlotGame {
    static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);

        int balance = 100;
        int bet;

        while(balance != 0){
            System.out.println("Your current balance is : "+balance);
            System.out.print("Place your bet : ");
            bet = sc.nextInt();

            if(bet <= 0 || bet > balance){
                System.out.println("bet should be in between (1 to 100)");
                continue;
            }else {
                balance -= bet;
            }
            System.out.println("spinning ...");
        }
    }
}
