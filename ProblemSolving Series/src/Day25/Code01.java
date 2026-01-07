package Day25;

/*
    🧩 Title: First Repeating Character in a String
📌 Problem Statement

Given a string, find the first character that repeats (appears more than once).

If no character repeats, print "No repeating character".
 */

public class Code01 {
    static void main(String[] args) {

        String word = "helloe";

        boolean isFounded = false;

        for(int i=0; i<word.length(); i++){
            int count = 0;
            char ch = word.charAt(i);
            for(int j=0; j<word.length(); j++){
                if(ch == word.charAt(j)){
                    count++;

                }
            }
            if(count>=2){
                System.out.println("repeated twice : "+word.charAt(i));
                isFounded = true;
                break;
            }

        }
        if(!isFounded) System.out.println("non repeated words");

    }
}
