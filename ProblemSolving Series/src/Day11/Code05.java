package Day11;

public class Code05 {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int evenCount = 0;
        int oddCount = 0;

        for(int val : arr){
            if(val%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("The even count is: "+evenCount+"\nThe odd count is : "+oddCount);
    }
}
