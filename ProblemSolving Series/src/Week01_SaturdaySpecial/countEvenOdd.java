package Week01_SaturdaySpecial;

public class countEvenOdd {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5,6,7,8,9};
        int countEven = 0, countOdd = 0;

        for(int val : list){
            if(val%2 == 0) countEven++;
            else countOdd++;
        }
        System.out.println("Even count is : "+countEven+" and Odd count is : "+countOdd);
    }
}
