# 📘 Java Number Programs – Day01

This folder contains **three Java programs** focused on basic **number-based problem solving**.
These programs help in understanding **loops, conditionals, mathematical logic, and optimization techniques** in Java.

---

## 1️⃣ Fibonacci Series – Sum of Even-Valued Terms

### 📌 Description

This program generates a **Fibonacci sequence** up to a given number of terms and calculates the **sum of even-valued Fibonacci numbers**.

---

### 🧠 Logic

* Initialize the first two Fibonacci numbers (`0` and `1`)
* Generate the next term as the sum of previous two terms
* Check if the generated number is even
* If even, add it to the sum
* Repeat for the given number of terms

---

### 💻 Code

```java
Scanner sc = new Scanner(System.in);

int a = 0, b = 1, next;
int sum = 0;

System.out.print("Enter the number > 0 && < 100 : ");
int size = sc.nextInt();

for (int i = 0; i < size; i++) {
    next = a + b;
    a = b;
    b = next;

    if (next % 2 == 0) {
        sum += next;
    }
}

System.out.println("Sum of even-valued Fibonacci terms: " + sum);
```

---

### ▶️ Example

| Input | Output                                 |
| ----- | -------------------------------------- |
| 10    | Sum of even-valued Fibonacci terms: 44 |

---

## 2️⃣ Prime Number Check

### 📌 Description

This program checks whether a given number is **prime**.
A prime number is greater than 1 and divisible **only by 1 and itself**.

---

### 🧠 Logic

* If the number ≤ 1 → not prime
* Check divisibility from `2` to `√number`
* If divisible by any number → not prime
* Otherwise → prime

---

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");
int Num = sc.nextInt();

boolean isPrime = true;

if (Num <= 1) {
    isPrime = false;
} else {
    for (int i = 2; i * i <= Num; i++) {
        if (Num % i == 0) {
            isPrime = false;
            break;
        }
    }
}

if (isPrime) {
    System.out.println("prime");
} else {
    System.out.println("not prime");
}
```

---

### ▶️ Example

| Input | Output    |
| ----- | --------- |
| 17    | prime     |
| 9     | not prime |

---

## 3️⃣ Prime Factorization (Print Prime Factors)

### 📌 Description

This program prints all **prime factors** of a given number.
Prime factors are factors that are themselves **prime numbers**.

---

### 🧠 Logic

* Start from the smallest prime number (`2`)
* While the number is divisible by the current value:

    * Print the value
    * Divide the number to remove that factor
* Continue until the number becomes `1`

---

### 💻 Code

```java
Scanner sc = new Scanner(System.in);
System.out.print("Enter your number: ");
int num = sc.nextInt();

for (int i = 2; i <= num; i++) {
    while (num % i == 0) {
        System.out.println(i + " Catched!!");
        num /= i;
    }
}

System.out.println("All prime minions exposed!");
```

---

### ▶️ Example

| Input | Output  |
| ----- | ------- |
| 18    | 2, 3, 3 |

---

## 📊 Summary Table

| Program            | Purpose                       |
| ------------------ | ----------------------------- |
| Fibonacci Even Sum | Sum of even Fibonacci numbers |
| Prime Check        | Check if a number is prime    |
| Prime Factors      | Print all prime factors       |

---

### 🚀 Author

**Sharwan Jung Kunwar**
Learning Java through problem-solving and logic building 💻🔥
