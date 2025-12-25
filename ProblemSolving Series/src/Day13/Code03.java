package Day13;

public class Code03 {
    static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int hold = 0;

        for(int i=0; i<arr.length-1; i++){
            if((arr[i+1] - arr[i]) != 1) {
                hold = arr[i] + 1;
                break;
            }
        }
        System.out.println(hold);

    }
}
