# 📝 Java Number Programs (Day04)

This repository contains basic **Java number-based programs** solved using loops, arithmetic operations, and conditional statements.  
These programs are commonly asked in **college labs, exams, and interviews**, and they help in building **logical thinking and problem-solving skills**.

---

## 📌 Programs Included

1. Check Armstrong Number
2. Check Perfect Number
3. Find Largest of Three Numbers

---

## 1️⃣ Check Armstrong Number

### 📝 Problem Statement

Write a Java program to **check whether a given number is an Armstrong number**.  
An Armstrong number is a number whose sum of digits raised to the power of the total number of digits equals the number itself.

---

### 🧠 Logic / Approach

* Store the original number in a variable for later comparison.
* Count the number of digits in the number.
* Extract each digit using `% 10` and raise it to the power of the total digit count.
* Sum all powered digits.
* Compare the sum with the original number to determine if it is an Armstrong number.

---

### 💻 Code

```java
package Day04;

import java.util.Scanner;

public class Code01 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int org = num;      // Store original number
        int count = 0, sum = 0;

        // Count digits
        while (num != 0) {
            num /= 10;
            count++;
        }

        num = org;

        // Calculate sum of digits raised to the power of count
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, count);
        }

        // Check and display result
        if (org == sum)
            System.out.println("The number " + org + " is Armstrong number");
        else
            System.out.println("The number " + org + " is not Armstrong number");
    }
}


```
---

### ▶️ Example

**Input:** `153`
**Output:** `The number 153 is Armstrong number`

---

### ✅ Summary

This program checks Armstrong numbers using loops, modulus operation, and power calculation. It demonstrates counting digits and conditional checking logic.

---




## 2️⃣ Check Perfect Number

### 📝 Problem Statement

Write a Java program to check whether a given number is a perfect number.
A perfect number is a number that is equal to the sum of its proper divisors (excluding itself).

---

### 🧠 Logic / Approach

* Loop from 1 to num-1 to find proper divisors.
* Add each divisor to a sum variable.
* Compare the sum with the original number to determine if it is perfect.

---

### 💻 Code

```java
package Day04;

import java.util.Scanner;

public class Code02 {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number : ");
        int num = sc.nextInt();

        int sum = 0;

        // Find sum of proper divisors
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check and display result
        if (num == sum) {
            System.out.println("This is a perfect number");
        } else {
            System.out.println("This is not a perfect number");
        }
    }
}

```

---

### ▶️ Example

**Input:** `6`
**Output:** `This is a perfect number`

---

### ✅ Summary

This program calculates the sum of proper divisors using a loop and determines if the number is perfect through conditional checking.

---

## 3️⃣ Find Largest of Three Numbers

### 📝 Problem Statement

Write a Java program to find the largest number among three numbers entered by the user.

---

### 🧠 Logic / Approach

* Take three numbers as input.
* Compare using conditional statements (if-else) with >= to handle equal values.
* Display the largest number.

---

### 💻 Code

```java
package Day04;

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first value : ");
        a = sc.nextInt();
        System.out.print("Enter your second value : ");
        b = sc.nextInt();
        System.out.print("Enter your third value : ");
        c = sc.nextInt();

        // Check for largest number
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number");
        } else {
            System.out.println(c + " is the largest number");
        }
    }
}

```

---

### ▶️ Example

**Input:** `12, 25, 8`
**Output:** `25 is the largest number`

---

### ✅ Summary

This program finds the largest number among three inputs using conditional statements and comparison operators. It handles cases where numbers may be equal.

---

## 🚀 Final Notes

* These programs strengthen loops, conditional statements, arithmetic operations, and number logic in Java.
* They are important for Java basics, exams, and interviews.
* Practicing these programs helps develop problem-solving and logical thinking skills.
---

### 📂 Author

**Sharwan Jung Kunwar**
*BCA Student | Java & Backend Developer*

---


