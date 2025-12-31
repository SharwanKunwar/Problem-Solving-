package Day18;

// Find the sum of diagonal elements.

public class Code02 {
    static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int sum =0;

        for(int i=0; i<matrix.length; i++){
            sum+=matrix[i][i]; // same same
        }
        System.out.println("Sum : "+sum);
    }
}
