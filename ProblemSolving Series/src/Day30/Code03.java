package Day30;

/*
2️⃣ Find Missing Number in a Range
Problem Statement

Given numbers from 1 to N with one missing number, find the missing one.

Example
Input: 1 2 3 5
Output: 4

📌 Hint:
Sum formula approach
 */

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};   // missing number is 4
        int n = arr.length + 1;   // because one number is missing

        int expectedSum = 0;
        int actualSum = 0;

        // Sum from 1 to N
        for (int i = 1; i <= n; i++) {
            expectedSum += i;
        }

        // Sum of given array
        for (int val : arr) {
            actualSum += val;
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing Number: " + missingNumber);
    }
}
