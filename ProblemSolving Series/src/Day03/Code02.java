package Day03;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String str = sc.nextLine(); // input string

        StringBuilder newString = new StringBuilder(); // used to build reversed string efficiently

        for (int i = str.length() - 1; i >= 0; i--) {
            newString.append(str.charAt(i)); // add characters from end to start
        }

        System.out.println("The reversed string is : " + newString);
    }
}
