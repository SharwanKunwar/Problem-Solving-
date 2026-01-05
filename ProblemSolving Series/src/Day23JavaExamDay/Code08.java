package Day23JavaExamDay;

/*
Write a Java program to manipulate the anti-diagonal elements of a 3×3 matrix.
The program should:
1. Initialize a 3×3 matrix with integer values.
2. Replace all anti-diagonal elements with 0.
   (Anti-diagonal positions: [0][2], [1][1], [2][0])
3. Display the modified matrix.
*/

public class Code08 {
    public static void main(String[] args) {

        // Declare and initialize a 3×3 matrix
        int[][] num = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Replace anti-diagonal elements with 0
        // Formula for anti-diagonal column index: j = n - 1 - i
        for (int i = 0; i < num.length; i++) {
            int j = num.length - 1 - i;
            num[i][j] = 0;
        }

        // Display the modified matrix
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}
