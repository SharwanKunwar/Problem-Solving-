package Day14;

//2️⃣ Find the Equilibrium Index
//Problem Statement:
//Find an index where the sum of elements on the left is equal to the sum of elements on the right.

public class Code02 {
    static void main(String[] args) {
        int [] arr = {1,3,5,2,2};
        int avgSize = arr.length/2;
        int sumLeft = 0;

        int totalSum = 0;

        for(int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int sumRight = totalSum-sumLeft-arr[i];
            if(sumRight == sumLeft){
                System.out.println("Equilibrium index found : "+i);
                break;
            }
            sumLeft+=arr[i];
        }

    }
}
