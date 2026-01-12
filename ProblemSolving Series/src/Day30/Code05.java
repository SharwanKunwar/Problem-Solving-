package Day30;

// reverse a string.

import java.util.Scanner;

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string : ");
        String str = sc.nextLine();

//        String reversedString = "";
        StringBuilder newString = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
//            reversedString+=str.charAt(i);
            newString.append(str.charAt(i));
        }
//        System.out.println("The reversed string is : \n"+reversedString);
        System.out.println(newString);
    }
}

