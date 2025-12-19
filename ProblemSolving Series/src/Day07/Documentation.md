# 📘 Day07 – Pattern Programs in Java

This README contains **Java pattern programs** from **Day07**, focusing on **nested loops** and **pattern logic building**. These programs help in understanding how the **outer loop controls rows** and the **inner loop controls columns or values**.

---

## 📌 Code01 – Solid Square Pattern

### 🔹 Description

Prints a **solid square pattern** of `*` based on the user input size.

### 🔹 Pattern Output (num = 5)

```
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
```

### 🔹 Logic Explanation

* Outer loop runs `num` times → controls rows
* Inner loop runs `num` times → prints `*` in each row
* After each row, a new line is printed

### 🔹 Code

```java
for(int i = 0; i < num; i++){
    for(int j = 0; j < num; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

---

## 📌 Code02 – Right Angle Star Triangle

### 🔹 Description

Prints a **right-angled triangle** using `*` symbols.

### 🔹 Pattern Output (num = 5)

```
*
* *
* * *
* * * *
* * * * *
```

### 🔹 Logic Explanation

* Outer loop controls number of rows
* Inner loop runs up to current row number (`j <= i`)
* Stars increase row by row

### 🔹 Code

```java
for(int i = 1; i <= num; i++){
    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

---

## 📌 Code03 – Number Triangle Pattern

### 🔹 Description

Prints a **number triangle** where numbers increase from `1` to the row number.

### 🔹 Pattern Output (num = 5)

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### 🔹 Logic Explanation

* Outer loop controls rows
* Inner loop prints numbers starting from `1` to `i`
* Numbers reset for each row

### 🔹 Code

```java
for(int i = 1; i <= num; i++){
    for(int j = 1; j <= i; j++){
        System.out.print(j + " ");
    }
    System.out.println();
}
```

---

## 📌 Code04 – Inverted Star Triangle

### 🔹 Description

Prints an **inverted right-angled triangle** using `*` symbols.

### 🔹 Pattern Output (num = 5)

```
* * * * *
* * * *
* * *
* *
*
```

### 🔹 Logic Explanation

* Outer loop starts from `num` and decrements
* Inner loop prints stars equal to current row value
* Pattern reduces row by row

### 🔹 Code

```java
for(int i = num; i >= 1; i--){
    for(int j = 1; j <= i; j++){
        System.out.print("* ");
    }
    System.out.println();
}
```

---

## 📌 Code05 – Continuous Number Triangle

### 🔹 Description

Prints a triangle with **continuous numbers** instead of restarting from 1.

### 🔹 Pattern Output

```
1
2 3
4 5 6
7 8 9 10
```

### 🔹 Logic Explanation

* A variable `num` keeps increasing
* Inner loop prints and increments `num`
* Numbers do not reset after each row

### 🔹 Code

```java
int num = 1;

for(int i = 1; i <= 5; i++){
    for(int j = 1; j < i; j++){
        System.out.print(num + " ");
        num++;
    }
    System.out.println();
}
```

---

## 🧠 Key Learning Outcomes

* Understanding **nested loops**
* Difference between **fixed and increasing patterns**
* Effect of **loop swapping** on pattern output
* Building logic step-by-step

---

## ✅ Summary

These Day07 programs strengthen **loop control**, **pattern logic**, and **problem-solving skills**, which are essential for **exams, interviews, and coding practice**.

---

⭐ *Keep practicing patterns — they build strong logic foundations!*
