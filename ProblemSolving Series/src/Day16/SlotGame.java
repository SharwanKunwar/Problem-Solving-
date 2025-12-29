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
            int result = spinning(bet);
            balance +=result;
            System.out.println("you win "+result+" and your total balance is : "+(result+balance));
        }

    }
    static int spinning(int bet){
        String [] symbol = {"7\uFE0F⃣","👽","💀"};
        boolean isWin = false;

        int random1 = (int)(Math.random() * 2) + 0;
        int random2 = (int)(Math.random() * 2) + 0;
        int random3 = (int)(Math.random() * 2) + 0;

        System.out.println(symbol[random1]);
        System.out.println(symbol[random2]);
        System.out.println(symbol[random3]);

        if(random1 == random2 && random1 == random3) {
            isWin = true;
        }

        if(isWin) return bet*7;

        return 0;

    }
}
