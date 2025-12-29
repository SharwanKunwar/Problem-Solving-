package Day16;

import java.util.Scanner;

public class Quiz {
    static void main(String[] args) {
        String[] questions = {"What is your name?","Who are you?","How old are you?"};
        String[][] option = {{"1. My name is Sharwan","2. my name is parbesh","3. marshal","4. human"},
                            {"1. pailot","2. doctor", "3. Developer", "4. boxer"},
                                {"1. 20", "2. below 18","3. 30","4. 22"}};


        int [] ans = {1,3,4};
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<questions.length; i++){
            System.out.println(((char)(65+i))+". "+questions[i]);
            for(int j=0; j<option[i].length; j++){
                System.out.println(option[i][j]);
            }
            System.out.print("\nChose: ");
            int guess = sc.nextInt();
            if(ans[i] == guess){
                System.out.println("correct");
            }else{
                System.out.println("wrong!!");
            }
            System.out.println("\n");
        }
    }
}
