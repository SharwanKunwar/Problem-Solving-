package Practice;

public class Code05 {
    static void main(String[] args) {
        int num = 343, rev = 0, org = num;

        for(; num!=0; num/=10){
            rev =(rev*10)+(num%10);
        }

        if(org == rev) System.out.println("yes");
        else System.out.println("no");

    }
}
