package Day12;

public class Code05 {
    public static void main(String[] args) {

        // Given array
        int[] arr = {1, 2, 31, 4, 15, 20};
        // max will store the largest element
        int max = arr[0];
        // hold will store the second largest element
        int hold = arr[0];

        // Loop through each element in the array
        for (int val : arr) {
            // If current value is greater than max
            if (max < val) {
                // Previous max becomes second largest
                hold = max;
                // Update max
                max = val;
            }

            // If value is less than max but greater than hold
            // and not equal to max
            else if (val > hold && val != max) {

                // Update second largest value 
                hold = val;
            }
        }
        System.out.println("The second largest element in array is: " + hold);
    }
}
