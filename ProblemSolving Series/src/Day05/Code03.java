package Day05;

public class Code03 {
    static void main(String[] args) {
        int[] num = {3,4,5,6,8,7,9};
        int evenCount = 0;
        int oddCount = 0;

        for(int val : num){
            if(val%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("The even count is : "+evenCount);
        System.out.println("The odd count is : "+oddCount);
    }
}
