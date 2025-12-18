# 📌 Day06 – Number Classification Programs

This folder contains **three Java programs** that check different types of special numbers using **loops, arithmetic operations, and conditional statements**. Each program takes an integer input from the user and determines whether it satisfies the conditions of a particular number type.

---

## 1️⃣ Strong Number Checker (`Code01.java`)

### 📝 Purpose
This program checks whether a given number is a **strong number**.  
A **strong number** is a number in which the sum of the factorials of its digits is equal to the number itself.

### 🔹 Example
- Input: `145`
- Calculation: `1! + 4! + 5! = 1 + 24 + 120 = 145`
- Output: `This is a strong number`

### 💻 Code Explanation
1. Read an integer input from the user.
2. Store the original number for comparison.
3. Extract each digit using modulo and integer division.
4. Calculate the factorial of each digit using a `for` loop.
5. Sum all the factorials.
6. Compare the sum with the original number.
7. Print whether it is a strong number or not.

### ⚡ Key Concepts
- Loops (`while` and `for`)
- Factorial calculation
- Modulo operator for digit extraction
- Conditional statements (`if-else`)

---

## 2️⃣ Neon Number Checker (`Code02.java`)

### 📝 Purpose
This program checks whether a given number is a **neon number**.  
A **neon number** is a number where the sum of the digits of its square is equal to the number itself.

### 🔹 Example
- Input: `9`
- Calculation: `9² = 81 → 8 + 1 = 9`
- Output: `neon number`

### 💻 Code Explanation
1. Read an integer input from the user.
2. Store the original number for comparison.
3. Calculate the square of the number.
4. Extract each digit of the square and calculate the sum.
5. Compare the sum with the original number.
6. Print whether it is a neon number or not.

### ⚡ Key Concepts
- Loops (`while`)
- Digit extraction using modulo
- Conditional statements (`if-else`)

---

## 3️⃣ Spy Number Checker (`Code03.java`)

### 📝 Purpose
This program checks whether a given number is a **spy number**.  
A **spy number** is a number where the **sum of its digits is equal to the product of its digits**.

### 🔹 Example
- Input: `123`
- Calculation: `Sum = 1 + 2 + 3 = 6`, `Product = 1 * 2 * 3 = 6`
- Output: `This is spy number`

### 💻 Code Explanation
1. Read an integer input from the user.
2. Initialize variables for sum and product.
3. Extract each digit using modulo and integer division.
4. Add each digit to the sum and multiply to the product.
5. Compare the sum and product.
6. Print whether it is a spy number or not.

### ⚡ Key Concepts
- Loops (`while`)
- Digit extraction using modulo
- Sum and product calculation
- Conditional statements (`if-else`)

---

