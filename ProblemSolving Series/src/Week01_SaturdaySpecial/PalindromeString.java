package Week01_SaturdaySpecial;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.next();
        StringBuilder reversedString = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            reversedString.append(str.charAt(i));
        }

        if(str.contains(reversedString)) System.out.println("yes");
        else System.out.println("no");








    }
}
