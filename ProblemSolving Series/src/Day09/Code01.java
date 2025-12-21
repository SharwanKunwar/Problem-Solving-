package Day09;

// Create an array of 5 floating and calculate their sum.

public class Code01 {
    public static void main(String[] args) {
        float[] marks = {20.4f, 40.5f, 63.1f, 89.5f, 99.9f};
        float sum = 0;

        for(float val : marks){
            sum+= val;
        }
        System.out.println("The sum is: "+sum);


    }
}
