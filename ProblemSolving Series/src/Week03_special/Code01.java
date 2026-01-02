package Week03_special;

// Count Vowels and Consonants in a String.
/*
    Problem Statement:
    Given a string, count how many vowels and consonants it contains.
 */

public class Code01 {
    static void main(String[] args) {
        String sample = "Programming";
        String easySample = sample.toLowerCase();
        int vowelCount = 0;
        int consonantsCount = 0;

        for(int i=0; i<easySample.length(); i++){
            if(easySample.charAt(i) == 'a' || easySample.charAt(i) == 'e' || easySample.charAt(i) == 'i' || easySample.charAt(i) == 'o' || easySample.charAt(i) == 'u') vowelCount++;
            else consonantsCount++;
        }
        System.out.println("Vowel count : "+vowelCount);
        System.out.println("Consonants count : "+consonantsCount);
    }
}
