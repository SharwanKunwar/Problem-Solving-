package Day26;

/*
🧩 5️⃣ Compress String (Basic Run-Length Encoding)

Problem Statement:
Compress the string by counting consecutive characters.

📌 Example
Input: aaabbccdaa
Output: a3b2c2d1a2
 */

public class Code04 {
    static void main(String[] args) {
            String sentence = "aaabbccdaa";
            String newString = "";

            for(int i=0; i<sentence.length(); i++){
                int count = 0;
                char ch = sentence.charAt(i);
                for(int j=i; j<sentence.length(); j++){
                    if(ch == sentence.charAt(j)){
                        count++;

                    }
                    if(ch != sentence.charAt(j)){
                        newString+=ch;
                        newString+=count;
                        break;
                    }

                }

            }
        System.out.println(newString);

    }
}