package Day23JavaExamDay;

/*
Write a Java program to multiply two matrices.
Matrix A is of order 2×3 and Matrix B is of order 3×2.
The program should display the resulting matrix.
*/

public class Code10 {
    public static void main(String[] args) {

        // Matrix A (2×3)
        int[][] matrix01 = {
                {2, 4, 6},
                {8, 2, 4}
        };

        // Matrix B (3×2)
        int[][] matrix02 = {
                {2, 4},
                {8, 4},
                {3, 5}
        };

        int rowA = matrix01.length;       // 2
        int colA = matrix01[0].length;    // 3
        int colB = matrix02[0].length;    // 2

        int[][] holdMatrix = new int[rowA][colB];

        // Matrix multiplication
        for (int i = 0; i < rowA; i++) {           // Rows of matix01
            for (int j = 0; j < colB; j++) {       // Columns of matrix02
                int sum = 0;                        // ✅ Reset sum for each element
                for (int k = 0; k < colA; k++) {   // Loop for multipliction
                    sum += matrix01[i][k] * matrix02[k][j];
                }
                holdMatrix[i][j] = sum;
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < holdMatrix.length; i++) {
            for (int j = 0; j < holdMatrix[i].length; j++) {
                System.out.print(holdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
