package Day13;

// Move all zeros to the end.

public class Code01 {
    static void main(String[] args) {
        int [] arr = {0,1,0,2,0,3,0,4,5,0};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j] == 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

        for(int val:arr){
            System.out.println(val);
        }
    }
}
