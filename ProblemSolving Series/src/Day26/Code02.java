package Day26;

/*
🧩 2️⃣ Remove All Spaces Without Using replace()

Problem Statement:
Remove all spaces from a string without using built-in replace methods.

📌 Example
Input: hello world java
Output: helloworldjava
 */

public class Code02 {
    public static void main(String[] args) {
        String sentence = "Hello world java";
        String newString = "";

        // Traverse each character of the sentence
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i) == ' '){
                continue;
            }
            newString +=sentence.charAt(i);
        }
        System.out.println("The new String with no space : "+newString);

    }
}
