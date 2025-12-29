package Day16;

// varArgs solve a bit method overloading.

public class varArgs {
    static void main(String[] args) {

        int result = sum(3,4,5,6,7,3);
        System.out.println("The total sum is : "+result);

    }
    static int sum(int ... arr){
        int sum = 0;
        for(int val: arr){
            sum+=val;
        }
        return sum;
    }
}
