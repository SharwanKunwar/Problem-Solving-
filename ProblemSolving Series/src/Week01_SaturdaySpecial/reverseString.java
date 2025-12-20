package Week01_SaturdaySpecial;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();
        StringBuilder newString = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            newString.append(str.charAt(i));
        }
        System.out.println("The new reversed string is : "+newString);
    }
}
