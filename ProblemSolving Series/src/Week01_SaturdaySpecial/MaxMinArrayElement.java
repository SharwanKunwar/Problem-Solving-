package Week01_SaturdaySpecial;

public class MaxMinArrayElement {
    static void main(String[] args) {

        int[] arr = {3,4,5,6,9,2};

        int max = arr[0];
        int min = arr[0];

        for(int val: arr){
            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
        }
        System.out.println("The max element of array is : "+max);
        System.out.println("The min element of array is : "+min);
    }
}
