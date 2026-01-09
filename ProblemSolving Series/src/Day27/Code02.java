package Day27;

/*
# Check Pangram Sentence

Problem Statement:
Check whether a sentence is a pangram (contains all alphabets from a to z at least once).

📌 Example
Input: The quick brown fox jumps over the lazy dog
Output: Pangram

 */

public class Code02 {
    static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String hold = str.toLowerCase();
        boolean isPangram = true;
        int[] frequency = new int[26];

        for(int i=0; i<hold.length(); i++){
            char ch = hold.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                frequency[ch - 'a']++;
            }
        }

        for(int i=0; i<26; i++){
            if(frequency[i] == 0){
                isPangram = false;
                break;
            }
        }

        if(isPangram) System.out.println("Pangram");
        else System.out.println("Not Pangram");

    }
}

/*
# 🔤 Pangram Check – Frequency Array Logic (Explanation)

This document explains the **idea and logic behind using a frequency array** to check whether a sentence is a **pangram** (contains all letters from `a` to `z` at least once).

---

## 🧠 Core Idea

We use an **integer array of size 26** to represent all lowercase English alphabets.

- Each index represents a letter:
  - `0 → a`
  - `1 → b`
  - `2 → c`
  - ...
  - `25 → z`

If a letter appears in the sentence, we **increase its count** in the array.

After processing the entire string:
- If **any index contains `0`**, it means that letter is **missing**
- Hence, the sentence is **NOT a pangram**

---

conclusion:

To create the frequency array, we map each character to an index using its ASCII value (ch - 'a')
and increment the value at that index. After processing the entire string, we check the frequency array;
if any element remains 0, it means that corresponding character is missing, so we set the flag to false.

 */


