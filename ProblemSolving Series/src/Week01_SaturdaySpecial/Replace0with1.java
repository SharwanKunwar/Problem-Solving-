package Week01_SaturdaySpecial;

public class Replace0with1 {
    static void main(String[] args) {
        int num = 1001;
        int place = 1;
        int result = 0;

        while(num!=0){
            int digit = num%10;
            if(digit == 0){
                digit = 1;
            }
            result = result+digit*place;
            place*=10;

            num/=10;
        }
        System.out.println(result);
    }
}
