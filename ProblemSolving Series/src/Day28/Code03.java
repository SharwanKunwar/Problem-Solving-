package Day28;

/*
3️⃣ Find the Longest Word in a Sentence
Problem Statement

Given a sentence, find the longest word.

Example
Input: Java is a powerful language
Output: powerful
 */

public class Code03 {
    static void main(String[] args) {
        String sentence = "java is a powerful language";
        String longestString = "";
        String current = "";

        for(int i=0; i<sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if(ch != ' '){
                current+=ch;
            }else{
                if(current.length() > longestString.length()){
                    longestString = current;
                }
                current = "";
            }
        }
        if(current.length() > longestString.length()){
            longestString = current;
        }

        System.out.println(longestString);
    }
}
