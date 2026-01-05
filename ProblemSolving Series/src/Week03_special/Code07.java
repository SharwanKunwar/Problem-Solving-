package Week03_special;

/*

Write a Java program that:

1 Takes marks of 5 subjects for a student using an array.
2. Calculates:
    * Total marks
    * Percentage
3. Displays the division based on percentage:
    * Distinction → Percentage ≥ 75
    * First Division → Percentage ≥ 60 and < 75
    * Second Division → Percentage ≥ 45 and < 60
    * Fail → Percentage < 45
 */

import java.util.Scanner;

public class Code07 {
    static void main(String[] args) {

        int[] subject = new int[5];
        int totalMarks = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<subject.length; i++){
            System.out.println("Enter sub "+(i+1)+" marks: ");
            subject[i] = sc.nextInt();
            totalMarks+=subject[i];
        }
        System.out.println("Total: "+totalMarks);
        double percentage = (double) (totalMarks*100)/500;
        System.out.println("percentage: "+percentage);

        if(percentage>=75){
            System.out.println("Distinction");
        }else if(percentage >= 60 && percentage < 75){
            System.out.println("First dev");
        }else if(percentage>=45 && percentage < 60){
            System.out.println("sedond devv");
        }else if(percentage < 45){
            System.out.println("Fail");
        }



    }
}
