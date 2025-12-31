package Day17;

// Find the largest Element in a matrix.
//Problem statement: Find the maximum number in the given 2D matrix.

public class Code02 {
    static void main(String[] args) {
        int [][] matrix = {{3,5,1},{9,2,6}};
        int max = matrix[0][0];

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The max element in 2d matrix is : "+max);


    }
}
