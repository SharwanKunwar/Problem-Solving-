package Day28;

/*
2️⃣ Check if Two Strings Are Rotations of Each Other
Problem Statement

Check whether one string is a rotation of another.

Example
Input:
str1 = abcd
str2 = cdab

Output: Yes (rotation)
 */

public class Code02 {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";



        if(str1.length() != str2.length()){
            System.out.println("No rotation");
        }else{
            String hold = str1+str1;
                if(hold.contains(str2)){
                    System.out.println("yes rotation");
                }else{
                    System.out.println("not rotation");
                }
        }




    }
}
