package Day05;

public class Code01 {
    static void main(String[] args) {
        int[] numbers = {22,32,34,4,65,88};
        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers){
            if (number > max){
                max = number;
            } else if(number < min) {
                min = number;
            }
        }

        System.out.println("The max number is : "+max);
        System.out.println("The min number is  : "+min);
    }
}
