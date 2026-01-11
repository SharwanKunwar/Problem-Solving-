package Day29;

/*
2️⃣ Reverse Words Order in a Sentence
Problem Statement

Reverse the order of words, not the characters.

Example
Input: Java is powerful
Output: powerful is Java
 */

import java.util.ArrayList;

public class Code02 {
    static void main(String[] args) {
        String str = "java is powerful";
        ArrayList<String> hold = new ArrayList<>();
        String track = "";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) != ' '){
                track+=str.charAt(i);
            }else{
                hold.add(track);
                track="";
            }

        }
        hold.add(track);

        for(int i=hold.size()-1; i>=0; i--){
            System.out.print(hold.get(i)+" ");
        }
    }
}
