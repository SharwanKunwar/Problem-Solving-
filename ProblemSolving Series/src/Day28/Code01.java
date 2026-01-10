package Day28;

/*
1️⃣ Find the First Non-Repeating Character
Problem Statement

Given a string, find the first character that does not repeat.

Example
Input:  swiss
Output: w

 */

public class Code01 {
    static void main(String[] args) {
        String str = "swiss";

        for(int i=0; i<str.length(); i++){
            int count = 0;
            char ch1 = str.charAt(i);
            for(int j=0; j<str.length(); j++){
                char ch2 = str.charAt(j);
                if(ch1 == ch2){
                    count++;
                }

            }
            if(count == 1){
                System.out.println(ch1);
                break;

            }

        }




    }
}
