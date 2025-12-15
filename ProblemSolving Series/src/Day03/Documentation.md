# 📝 Java String Programs (Day03)

This repository contains basic **Java string-based programs** solved using loops and string manipulation techniques.  
These programs are commonly asked in **college labs, exams, and interviews**, and they help in building **logical thinking and string handling skills**.

---

## 📌 Programs Included

1. Count Vowels in a String
2. Reverse a String
3. Check Palindrome String

---

## 1️⃣ Count Vowels in a String

### 📝 Problem Statement

Write a Java program to **count the number of vowels** (`a, e, i, o, u`) in a given input string.

---

### 🧠 Logic / Approach

* Convert the input string to lowercase for **case-insensitive comparison**.
* Initialize a counter variable `count` to `0`.
* Loop through each character of the string:
    * If the character is a vowel, increment the counter.
* Print the total count of vowels.

---

### 💻 Code

```java
package Day03;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase(); // Convert to lowercase

        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i); // Get each character
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // Increment count if vowel found
            }
        }

        System.out.println("Vowel count: " + count);
    }
}

```
---

### ▶️ Example

**Input:** `Nepali`
**Output:** `3`

---

### ✅ Summary

This program counts vowels in a string using a simple loop and conditional checks, demonstrating basic string traversal and character comparison.

---




## 2️⃣ Reverse a String

### 📝 Problem Statement

Write a Java program to **reverse a given string** entered by the user.

---

### 🧠 Logic / Approach

* Create a StringBuilder object to store the reversed string.
* Loop from the last character to the first character of the input string:
  * Append each character to the StringBuilder.
* Print the reversed string.

---

### 💻 Code

```java
package Day03;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String : ");
        String str = sc.nextLine(); // Input string

        StringBuilder newString = new StringBuilder(); // Efficient string builder

        for (int i = str.length() - 1; i >= 0; i--) {
            newString.append(str.charAt(i)); // Add characters from end to start
        }

        System.out.println("The reversed string is: " + newString);
    }
}
```

---

### ▶️ Example

**Input:** `Sharwan`
**Output:** `nawrahS`

---

### ✅ Summary

This program demonstrates string reversal using StringBuilder and loops, which is more efficient than concatenating strings repeatedly.

---

## 3️⃣ Check Palindrome String

### 📝 Problem Statement

Write a Java program to **check whether a given word is a palindrome** (reads the same backward as forward).

---

### 🧠 Logic / Approach

* Use a StringBuilder to reverse the input string.
* Compare the original string with the reversed string:
  * If equal → Palindrome
  * Else → Not a Palindrome

---

### 💻 Code

```java
package Day03;

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your word: ");
        String str = sc.next(); // Input word

        StringBuilder reversedString = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--){
            reversedString.append(str.charAt(i)); // Reverse the string
        }

        if(str.contentEquals(reversedString)){
            System.out.println("Yes, given word is a palindrome.");
        } else {
            System.out.println("No, given word is not a palindrome.");
        }

        sc.close(); // Close scanner
    }
}

```

---

### ▶️ Example

**Input:** `radar`
**Output:** `Yes, given word is a palindrome.`

---

### ✅ Summary

This program checks palindrome words using string reversal and comparison, helping to understand loops, string manipulation, and conditional checks.

---

## 🚀 Final Notes

* These programs strengthen loop + string manipulation logic
* Important for Java basics, exams, and interviews
* Practice them without copy-paste to master the concepts 👍
---

### 📂 Author

**Sharwan Jung Kunwar**
*BCA Student | Java & Backend Developer*

---


