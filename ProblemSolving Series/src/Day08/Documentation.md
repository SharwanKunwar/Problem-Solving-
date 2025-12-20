# 🔢 Java Number Programs (Day08)

This repository contains **Java number-based programs** from **Day08** focusing on **digit operations and number manipulation**.  
These programs help in building **strong logical thinking** and mastering **loops, conditionals, and arithmetic operations**.

---

## 📌 Programs Included

1. Find the Smallest Digit in a Number
2. Find the Largest Digit in a Number
3. Count Frequency of Each Digit
4. Replace All 0 with 1
5. Compare Reverse of Two Numbers

---

## 1️⃣ Find the Smallest Digit in a Number

### 📝 Problem Statement

Write a Java program to **find the smallest digit** in a given positive integer.

---

### 🧠 Logic / Approach

* Initialize a variable to store the smallest digit (start with 9).
* Extract the last digit using `% 10`.
* Compare with the current smallest digit and update if smaller.
* Remove the last digit using `/ 10`.
* Repeat until the number becomes 0.

---

### 💻 Code

```java
package Day08;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int holdSmallestNum = 9;

        while(num != 0){
            int track = num % 10;
            if(track < holdSmallestNum){
                holdSmallestNum = track;
            }
            num /= 10;
        }

        System.out.println("The smallest number is: " + holdSmallestNum);
        sc.close();
    }
}

```

---

### ▶️ Example

**Input:** `5921`
**Output:** `1`

---

### ✅ Summary

This program extracts digits one by one and determines the smallest digit using arithmetic operations and loops.

---

---

## 2️⃣ Find the Largest Digit in a Number

### 📝 Problem Statement

Write a Java program to find the largest digit in a given positive integer.

---

### 🧠 Logic / Approach

* Initialize a variable to store the largest digit (start with 0).
* Extract digits using % 10.
* Compare with the current largest digit and update if larger.
* Repeat until all digits are processed.


---

### 💻 Code

```java
package Day08;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your digit: ");
        int num = sc.nextInt();
        int org = num;
        int holdLargestNum = 0;

        for(; num != 0; num /= 10){
            int temp = num % 10;
            if(temp > holdLargestNum) {
                holdLargestNum = temp;
            }
        }

        System.out.println("The largest digit of '" + org + "' is: " + holdLargestNum);
        sc.close();
    }
}

```

---

### ▶️ Example

**Input:** `5921`
**Output:** `9`

---

### ✅ Summary

This program identifies the largest digit by comparing each extracted digit iteratively.

---

---

## 3️⃣ Count Frequency of Each Digit

### 📝 Problem Statement

Count Frequency of Each Digit

---

### 🧠 Logic / Approach

* Extract digits using % 10.
* Use a nested loop to count occurrences in the original number.
* Print the frequency for each digit.
* Repeat until all digits are processed.

---

### 💻 Code

```java
package Day08;

public class Code03 {
    public static void main(String[] args) {
        int num = 1445;
        int org = num;

        while (num != 0) {
            int digit = num % 10;
            int count = 0;
            int temp = org;

            while (temp != 0) {
                if (temp % 10 == digit) {
                    count++;
                }
                temp /= 10;
            }

            System.out.println("Digit " + digit + " appears " + count + " times");
            num /= 10;
        }
    }
}

```

---

### ▶️ Example

**Input:** `1445`

**Output:** 
```declarative
Digit 5 appears 1 times
Digit 4 appears 2 times
Digit 1 appears 1 times
```


---

### ✅ Summary

This program counts how many times each digit appears in a number using nested loops.

---

## 4️⃣ Replace All 0 with 1

### 📝 Problem Statement

Write a Java program to replace all 0 digits in a number with 1.

---

### 🧠 Logic / Approach

* Extract digits using % 10.
* Replace 0 with 1 if found.
* Reconstruct the number using place value multiplication.
* Repeat until all digits are processed.

---

### 💻 Code

```java
package Day08;

public class Code04 {
    public static void main(String[] args) {
        int num = 1001;
        int place = 1;
        int newNumber = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 0) digit = 1;
            newNumber = newNumber + digit * place;
            place *= 10;
            num /= 10;
        }

        System.out.println(newNumber);
    }
}
```

---

### ▶️ Example

**Input:** `1001`
**Output:** ```1111```


---

### ✅ Summary

This program modifies a number by replacing all zeros with ones while maintaining the correct digit positions.

---

## 5️⃣ Compare Reverse of Two Numbers

### 📝 Problem Statement

Write a Java program to reverse two numbers and check if they are the same after reversing.

---

### 🧠 Logic / Approach

* Reverse each number independently using % 10 and / 10.
* Compare the reversed numbers.
* Print result based on equality.

---

### 💻 Code

```java
package Day08;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int rev01 = 0, rev02 = 0;

        while (num1 != 0) {
            rev01 = rev01 * 10 + num1 % 10;
            num1 /= 10;
        }

        while (num2 != 0) {
            rev02 = rev02 * 10 + num2 % 10;
            num2 /= 10;
        }

        if (rev01 == rev02)
            System.out.println("Same after reverse");
        else
            System.out.println("Not same after reverse");

        sc.close();
    }
}

```

---

### ▶️ Example

**Input:** `num1 = 123, num2 = 321`

**Output:** ```Not same after reverse```


---

### ✅ Summary

This program checks whether two numbers are equal after reversing by comparing the reversed values.

---

## 🚀 Final Notes

* These programs strengthen loop, number manipulation, and logical thinking skills.
* Essential for Java basics, college labs, and coding interviews.
* Recommended to practice without copy-paste to understand the logic fully.

---

### 📂 Author

**Sharwan Jung Kunwar**
*BCA Student | Java & Backend Developer*

---


