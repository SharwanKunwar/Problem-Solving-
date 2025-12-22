# 🔢 Java Number Programs (Day10)

This repository contains **Java number-based programs** from **Day10** focusing on **loops, number system conversions, and prime checking**.  
These programs help in building **strong logical thinking** and mastering **loops, conditionals, and arithmetic operations**.

---

## 📌 Programs Included

1. Reverse a Number
2. Sum of Digits Until Single Digit
3. Count Trailing Zeros
4. Optimized Prime Check
5. Decimal to Binary
6. Binary to Decimal

---

## 1️⃣ Reverse a Number

### 📝 Problem Statement

Write a Java program to **reverse a given number** using loops.

---

### 🧠 Logic / Approach

* Extract last digit using `% 10`.
* Multiply the reversed number by 10 and add the extracted digit.
* Remove last digit from original number using `/ 10`.
* Repeat until number becomes 0.

---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        int rev = 0;

        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reversed number: " + rev);
        sc.close();
    }
}

```

---

### ▶️ Example

**Input:** `1234`
**Output:** `4321`

---

### ✅ Summary

This program reverses a number using basic arithmetic operations and loops.

---

---

## 2️⃣ Sum of Digits Until Single Digit

### 📝 Problem Statement

Take a number and repeatedly sum its digits until the result becomes a single digit.

---

### 🧠 Logic / Approach

* Use a loop to sum digits using % 10.
* Continue summing the result until it is less than 10.
* Count the number of iterations.
---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        while(num >= 10){
            int sum = 0;
            while(num != 0){
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        System.out.println("The final single digit: " + num);
        sc.close();
    }
}


```

---

### ▶️ Example

**Input:** `9875`
**Output:** `2`

---

### ✅ Summary

This program reduces a number to a single digit by repeatedly summing its digits.

---

---

## 3️⃣ Count Trailing Zeros

### 📝 Problem Statement

Count how many zeros appear at the end of a number.

---

### 🧠 Logic / Approach

* Extract last digit using % 10.
* Count zeros until a non-zero digit is found.
* Stop counting at the first non-zero digit.

---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        int count = 0;
        while(num != 0){
            if(num % 10 == 0){
                count++;
            } else {
                break;
            }
            num /= 10;
        }

        System.out.println("Trailing zeros: " + count);
        sc.close();
    }
}


```

---

### ▶️ Example

**Input:** `12000`

**Output:** `3`


---

### ✅ Summary

This program counts trailing zeros by examining digits from right to left.

---

## 4️⃣ Optimized Prime Check

### 📝 Problem Statement

Check whether a number is prime using optimized logic.

---

### 🧠 Logic / Approach

* If number ≤ 1 → not prime.
* Loop from 2 to √num to check divisibility.
* If divisible → not prime.
* Stop loop immediately after finding a divisor.

---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            isPrime = false;
        } else {
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        sc.close();
    }
}

```

---

### ▶️ Example

**Input:** `29`
**Output:** ```Prime```


---

### ✅ Summary

This program checks primality efficiently using √n optimization.

---

## 5️⃣ Decimal to Binary

### 📝 Problem Statement

Convert a decimal number to binary manually without using built-in functions.

---

### 🧠 Logic / Approach

* Repeatedly divide the number by 2.
* Multiply remainder by place value (* 10) and accumulate.
* Continue until number becomes 0.

---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number: ");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Binary = 0");
            return;
        }

        int binary = 0, place = 1;

        while(num > 0){
            int rem = num % 2;
            binary += rem * place;
            place *= 10;
            num /= 2;
        }

        System.out.println("Binary = " + binary);
        sc.close();
    }
}


```

---

### ▶️ Example

**Input:** `10`

**Output:** ```1010```


---

## 6️⃣ Binary to Decimal

### 📝 Problem Statement

Convert a binary number to decimal manually.

---

### 🧠 Logic / Approach

* Extract digits from right using % 10.
* Multiply by 2^position and accumulate.
* Increment position for each digit.

---

### 💻 Code

```java
package Day10;

import java.util.Scanner;

public class Code06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int num = sc.nextInt();

        int decimal = 0, power = 0;

        while(num != 0){
            int digit = num % 10;
            decimal += digit * (int)Math.pow(2, power);
            power++;
            num /= 10;
        }

        System.out.println("Decimal = " + decimal);
        sc.close();
    }
}
```

---

### ▶️ Example

**Input:** `1010`

**Output:** ```10```


---

### ✅ Summary

This program converts binary to decimal using arithmetic operations and powers of 2.

---

## 🚀 Final Notes

* These programs strengthen loops, digit manipulation, and number system logic.
* Essential for Java basics, college labs, and coding interviews.
* Recommended to practice manually to understand logic deeply.

---

### 📂 Author

**Sharwan Jung Kunwar**
*BCA Student | Java & Backend Developer*

---


