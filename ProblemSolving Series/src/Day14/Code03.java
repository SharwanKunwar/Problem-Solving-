package Day14;

//3️⃣ Find the Majority Element
//Problem Statement: Find the element that appears more than n/2 times in the array.

public class Code03 {
    static void main(String[] args) {
        int [] arr = {2,2,1,2,3,4,2};
        int n = arr.length;
        int hold = -1;

        for(int i=0; i<arr.length; i++){
            int count =0;
            for(int j=0; j<arr.length; j++){

                if(arr[i] == arr[j] ){
                    count++;
                }
                if(count > n/2){
                    hold = arr[i];
                    break;
                }
            }
        }

        if(hold!=-1) System.out.println("Majority element: "+hold);
        else System.out.println("no majority element.");
    }
}
