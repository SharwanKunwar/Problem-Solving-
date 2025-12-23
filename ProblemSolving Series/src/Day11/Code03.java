package Day11;

public class Code03 {
    static void main(String[] args) {
        int[] arr = {1,41,5,6,7};
        int largest = arr[0];

        for(int val:arr){
            if(val > largest){
                largest = val;
            }
        }
        System.out.println("The largest element of array is : "+largest);
    }
}
