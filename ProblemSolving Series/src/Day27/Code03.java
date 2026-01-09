package Day27;

/*
## Remove Consecutive Duplicate Characters

Problem Statement:
Remove only consecutive duplicate characters from a string.

📌 Example
Input: aaabbbccaadd
Output: abcad
 */

public class Code03 {
    static void main(String[] args) {
        String string = "aaabbbccaadd";
        String result ="";
        result+=string.charAt(0);

        for(int i=1; i<string.length(); i++){
            if(string.charAt(i) != string.charAt(i-1)){
                result+=string.charAt(i);
            }
        }

        System.out.println(result);

    }
}
