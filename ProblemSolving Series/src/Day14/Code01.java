package Day14;

//1️⃣ Find the First Repeating Element
//Problem Statement:
//Find the first element that appears more than once in the array (first repeating means smallest index, not the smallest value).

public class Code01 {
    static void main(String[] args) {
        int[] arr = {1,5,3,4,5,6};
        int repeatingElement = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    repeatingElement = arr[i];
                    System.out.println(repeatingElement);
                    return;
                }

            }

        }

    }
}
