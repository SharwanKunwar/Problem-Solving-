package Day03;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String sentence = sc.nextLine().toLowerCase(); // convert to lowercase for easy comparison

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); // get each character

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // increase count if vowel found
            }
        }

        System.out.println("Vowel count: " + count);
    }
}

//check your name how many vowel it contain == commonly there is two 2 vowel in nepali name why ?