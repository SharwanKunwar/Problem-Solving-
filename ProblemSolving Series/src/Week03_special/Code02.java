package Week03_special;

/*
    Reverse a String without using built-in methods
 */

public class Code02 {
    static void main(String[] args) {

        String str = "Java";
        String newString = "";

        for(int i=str.length()-1; i>=0; i--){
            newString += str.charAt(i);
        }
        System.out.println("Reversed String is : "+newString);

    }
}
