package Day05;

public class Code02 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int sum = 0;

        for(int val : arr){
            sum+=val;
        }

        System.out.println("The sum is : "+sum);
    }
}
