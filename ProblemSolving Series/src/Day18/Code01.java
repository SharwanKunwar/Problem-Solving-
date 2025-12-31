package Day18;

// column wise sum of a matrix

public class Code01 {
    static void main(String[] args) {
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i< matrix.length; i++){
            int sum = 0;
            for(int j=0; j<matrix.length; j++){
                sum+=matrix[j][i];
            }
            System.out.println("The sum is : "+sum);
        }

    }
}
