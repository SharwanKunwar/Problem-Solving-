package Day23JavaExamDay;

/*
Write a Java program to manipulate the diagonal elements of a 3×3 matrix.
The program should:
1. Initialize a 3×3 matrix with integer values.
2. Replace all main diagonal elements with 0.
3. Display the modified matrix.
*/

public class Code09 {
    public static void main(String[] args) {

        // Declare and initialize a 3×3 matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Replace main diagonal elements with 0
        // Diagonal condition: row index == column index
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 0;
        }

        // Display the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }
    }
}
