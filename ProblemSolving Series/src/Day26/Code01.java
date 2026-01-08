package Day26;

public class Code01 {
    static void main(String[] args) {

        String sentence = "Who is Mahakal";

        String currentString = "";
        String longestString = "";

        // Traverse each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {

            // Build word until space is found
            if (sentence.charAt(i) != ' ') {
                currentString += sentence.charAt(i);
            }
            // Word ends at space
            else {
                if (currentString.length() > longestString.length()) {
                    longestString = currentString;
                }
                currentString = "";
            }
        }

        // Check last word
        if (currentString.length() > longestString.length()) {
            longestString = currentString;
        }

        // Print longest word
        System.out.println("The longest string is : " + longestString);
    }
}
