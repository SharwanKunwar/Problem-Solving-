package Week03_special;

/*
    Title: Remove Duplicate Characters from a string.
    Problem Statement:
    Remove duplicate characters and print the resulting string.
 */

import java.util.Scanner;

public class Code06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        String holdString = "";

        for(int i=0; i<str.length(); i++){
            int count = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count<=1){
                holdString+=str.charAt(i);
            }



        }
        System.out.println(holdString);




    }
}
