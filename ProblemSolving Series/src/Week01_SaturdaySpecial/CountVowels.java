package Week01_SaturdaySpecial;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine().toLowerCase();

        int vowelsCount = 0;

        for(int i=0; i<str.length(); i++){
            int ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount++;
            }
        }
        System.out.println("Total vowel count is : "+vowelsCount);
    }
}
