package Day15;

public class Code02 {
    static void main(String[] args) {
        int [] arr = {-2,1,4,-1,2,1,-5,4};

        int curentSum = 0;
        int maxSum = arr[0];

        for(int i=0; i<arr.length; i++){
            curentSum +=arr[i];
            if(curentSum > maxSum){
                maxSum = curentSum;
            }
            if(curentSum < 0){
                curentSum =0;
            }
        }
        System.out.println("maxium subArray is: "+maxSum);
    }
}
