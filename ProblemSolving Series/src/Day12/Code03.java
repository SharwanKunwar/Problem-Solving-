package Day12;

import java.lang.reflect.Array;

public class Code03 {
    static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6};
        int[] newArray = new int[arr.length];


        for(int i= arr.length-1; i>=0; i--){
            newArray[arr.length-1-i] = arr[i];
        }

        for(int val:newArray){
            System.out.println(val);
        }
    }
}
