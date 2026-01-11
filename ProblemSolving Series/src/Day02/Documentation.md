 # 🔢 Java Number Programs (Day02)

This repository contains basic **Java number-based programs** solved using loops and arithmetic operations.
These programs are commonly asked in **college labs, exams, and interviews**, and they help in building strong logical thinking.

---

## 📌 Programs Included

1. Reverse a Number
2. Sum of Digits of a Number
3. Palindrome Number Check

---

## 1️⃣ Reverse a Number

### 📝 Problem Statement

Write a Java program to **reverse a given integer number** entered by the user.

---

### 🧠 Logic / Approach

* Initialize a variable `rev` to store the reversed number.
* Extract the **last digit** using `% 10`.
* Append it to `rev` by multiplying `rev` by 10.
* Remove the last digit using `/ 10`.
* Repeat until the number becomes 0.

---

### 💻 Code

```java
package Day02;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println(rev);
    }
}
```

---

### ▶️ Example

**Input:** `1234`
**Output:** `4321`

---

### ✅ Summary

This program reverses a number by **extracting and rebuilding digits** using modulo and division operations.

---

---

## 2️⃣ Sum of Digits of a Number

### 📝 Problem Statement

Write a Java program to **find the sum of digits** of a given number.

---

### 🧠 Logic / Approach

* Use `Math.abs()` to handle negative numbers.
* Extract the last digit using `% 10`.
* Add it to `sum`.
* Remove the last digit using `/ 10`.
* Continue until the number becomes 0.

---

### 💻 Code

```java
package Day02;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {

        // Scanner object: because mind reading user input is still not possible
        Scanner sc = new Scanner(System.in);

        // Asking the user for a number (politely)
        System.out.print("Enter your Digit: ");
        int digit = sc.nextInt();

        // sum will store the final result
        int sum = 0;

        // Ignore negative sign
        digit = Math.abs(digit);

        // Loop until no digits are left
        while (digit != 0) {
            sum += digit % 10;
            digit /= 10;
        }

        System.out.println("The sum is : " + sum);
        sc.close();
    }
}
```

---

### ▶️ Example

**Input:** `-256`
**Output:** `13`

---

### ✅ Summary

This program calculates the **sum of individual digits** by repeatedly extracting digits from the number.

---

---

## 3️⃣ Palindrome Number Check

### 📝 Problem Statement

Write a Java program to **check whether a number is a palindrome or not**.

---

### 🧠 Logic / Approach

* Store the original number.
* Reverse the number using the same logic as reverse program.
* Compare the reversed number with the original.
* If both are equal → Palindrome.

---

### 💻 Code

```java
package Day02;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        // Negative numbers are not palindrome
        if (num < 0) {
            System.out.println("Negative numbers are not palindrome");
            sc.close();
            return;
        }

        int original = num;
        int rev = 0;

        while (num != 0) {
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }

        if (original == rev)
            System.out.println("The number " + original + " is a Palindrome number");
        else
            System.out.println("The number " + original + " is not a Palindrome number");

        sc.close();
    }
}
```

---

### ▶️ Example

**Input:** `121`
**Output:** `Palindrome number`

---

### ✅ Summary

A palindrome number remains **the same after reversing**. This program checks it by comparing the original and reversed values.

---

## 🚀 Final Notes

* These programs strengthen **loop + number manipulation logic**
* Very important for **Java basics, exams, and interviews**
* Recommended to practice without copy-paste once 👍

---

### 📂 Author

**Sharwan Jung Kunwar**
*BCA Student | Java & Backend Developer*

---


