package Day26;

/*
🧩 4️⃣ Find Duplicate Words in a Sentence

Problem Statement:
Find and print duplicate words in a sentence.

📌 Example
Input: java is java and java is fun
Output: java , is
 */

public class Code03 {
    static void main(String[] args) {
        String sentence = "who are you are";
        String[] words = sentence.split(" ");

        boolean[] track = new boolean[words.length];

        // Compare each word with remaining words
        for (int i = 0; i < words.length; i++) {

            // Skip already checked words
            if (track[i]) continue;

            int count = 1;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    track[j] = true;
                }
            }

            // Print word if it appears more than once
            if (count > 1) {
                System.out.println(words[i]);
            }
        }


    }
}
