package Day13;

import java.util.Scanner;

public class Code05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] store = new int[arr.length];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        boolean found = false;
        int index = 0;

        for (int val : arr) {
            if (val == num) {
                found = true;
                break;
            }
        }

        if (found) {
            int storeIndex = 0;
            // add elements except num in reverse order
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] != num) {
                    store[storeIndex++] = arr[i];
                }
            }
            store[storeIndex] = num;
        }

        for (int val : store) {
            System.out.println(val);
        }
    }
}
