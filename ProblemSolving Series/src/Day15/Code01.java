package Day15;

// find first non-repeating element.

public class Code01 {
    static void main(String[] args) {
        int[] arr = {1,1,3,1,5,5};

        for(int i=0; i<arr.length; i++){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("non-repeating element is : "+arr[i]);
            }
        }
    }
}
