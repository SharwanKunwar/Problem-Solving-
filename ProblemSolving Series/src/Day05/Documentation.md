# 📘 Day05 – Java Array Programs

This README contains basic **Java array programs** implemented using enhanced for-loops. These programs are helpful for **college labs, exams, and interview preparation**, and they strengthen understanding of array traversal and conditional logic.

---

## 📌 Programs Included

1. Find Maximum and Minimum Element in an Array
2. Find Sum of Elements in an Array
3. Count Even and Odd Numbers in an Array

---

## 1️⃣ Find Maximum and Minimum Element in an Array

### 📝 Description

This program finds the **maximum** and **minimum** values present in an integer array. The first element of the array is assumed as both max and min initially, and then the array is traversed to update them accordingly.

### 💻 Code

```java
package Day05;

public class Code01 {
    static void main(String[] args) {
        int[] numbers = {22,32,34,4,65,88};
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers){
            if (number > max){
                max = number;
            } else if(number < min) {
                min = number;
            }
        }

        System.out.println("The max number is : "+max);
        System.out.println("The min number is  : "+min);
    }
}
```

### ✅ Summary

This program traverses an array to determine the largest and smallest values using conditional checks.

---

## 2️⃣ Find Sum of Elements in an Array

### 📝 Description

This program calculates the **sum of all elements** present in an integer array using an enhanced for-loop.

### 💻 Code

```java
package Day05;

public class Code02 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum = 0;

        for(int val : arr){
            sum += val;
        }

        System.out.println("The sum is : "+sum);
    }
}
```

### ✅ Summary

This program iterates through the array and adds each element to calculate the total sum.

---

## 3️⃣ Count Even and Odd Numbers in an Array

### 📝 Description

This program counts how many **even** and **odd** numbers are present in an integer array by checking the remainder when divided by 2.

### 💻 Code

```java
package Day05;

public class Code03 {
    static void main(String[] args) {
        int[] num = {3,4,5,6,8,7,9};
        int evenCount = 0;
        int oddCount = 0;

        for(int val : num){
            if(val % 2 == 0){
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("The even count is : "+evenCount);
        System.out.println("The odd count is : "+oddCount);
    }
}
```

### ✅ Summary

This program separates and counts even and odd numbers from an array using conditional logic.

---

## 🎯 Key Concepts Used

* Arrays in Java
* Enhanced for-loop
* Conditional statements
* Basic arithmetic operations

---

✨ *These programs are ideal for beginners to practice array operations in Java.*
