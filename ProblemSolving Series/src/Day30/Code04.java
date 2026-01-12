package Day30;

// count the vowel letter in given string.

import java.util.Scanner;

public class Code04 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        int count = 0;


        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == '0' || ch == 'u'){
                count++;
            }
        }
        System.out.println(count+" Vowels are found in given string.");
    }
}

