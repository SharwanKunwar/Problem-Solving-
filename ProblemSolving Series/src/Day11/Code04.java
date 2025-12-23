package Day11;

public class Code04 {
    static void main(String[] args) {
        int[] arr = {11,41,5,6,7};
        int smallest = arr[0];

        for(int val:arr){
            if(val < smallest){
                smallest = val;
            }
        }
        System.out.println("The largest element of array is : "+smallest);
    }
}
