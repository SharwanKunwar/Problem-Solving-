package Week03_special;

/*
    Title : Count frequency of each character in a string.
 */

import java.util.Scanner;

public class Code05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your String : ");
        String str = sc.nextLine();


        for(int i=0; i<str.length(); i++){
            int count = 0;
            boolean isAlreadyCounted = false;

            for(int k = 0; k<i; k++){
                if(str.charAt(i) == str.charAt(k)){
                    isAlreadyCounted = true;
                    break;
                }
            }
            if(isAlreadyCounted) continue;

            for(int j=0; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j)) count++;
            }
            System.out.println(str.charAt(i) + " count is : "+count);
        }
    }
}
