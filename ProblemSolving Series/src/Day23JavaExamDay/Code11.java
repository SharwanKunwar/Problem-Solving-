package Day23JavaExamDay;

// 3x3 matrix multiplication
public class Code11 {
    public static void main(String[] args) {
        int[][] matrix01 = {
                {12, 22, 23},
                {24, 15, 16},
                {27, 18, 29}
        };
        int[][] matrix02 = {
                {2, 21, 13},
                {41, 15, 16},
                {17, 18, 19}
        };

        int[][] holdMatrix = new int[3][3];

        // Multiplication of two matrices
        for (int i = 0; i < 3; i++) {          // Rows of matrix01
            for (int j = 0; j < 3; j++) {      // Columns of matrix02
                int sum = 0;                    // ✅ Reset sum for each element
                for (int k = 0; k < 3; k++) {  // Loop for multiplication
                    sum += matrix01[i][k] * matrix02[k][j];
                }
                holdMatrix[i][j] = sum;
            }
        }

        // Display holdMatrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(holdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
