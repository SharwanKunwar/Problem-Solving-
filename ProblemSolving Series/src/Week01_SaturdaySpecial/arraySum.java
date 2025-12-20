package Week01_SaturdaySpecial;

public class arraySum {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for(int val : arr){
            sum+=val;
        }
        System.out.println("The sum of array is : "+sum);
    }
}
