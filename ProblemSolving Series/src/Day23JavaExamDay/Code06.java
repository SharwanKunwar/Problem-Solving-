package Day23JavaExamDay;

/*
Write a Java program to calculate the total marks and average marks of a student in five subjects.
The program should:

1.Accept marks of five subjects from the user using the Scanner class.
2.Calculate the total marks.
3.Calculate the average marks.
4.Display the total and average marks.

 */

import java.util.Scanner;

public class Code06 {
    static void main(String[] args) {
        int totalMarks=0;
        double avg;
        int marks;
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++){
            System.out.print("Enter the subject "+(i+1)+" marks : ");
            marks = sc.nextInt();
            totalMarks+=marks;
        }
        avg = totalMarks/5.0;

        System.out.println("The total marks Is; "+totalMarks);
        System.out.println("avg is : "+avg);


    }
}
