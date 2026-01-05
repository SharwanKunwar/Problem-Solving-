package Day23JavaExamDay;
/*
    Write a java program to evaluate following expression take user input a,b,c;
    i. x = a-b/3.0+c*2-1;
    ii. y = a-(float)b/(3+c)*(2-1);
    iii. z = a-((float)b/(3+c)*2)-1;
 */

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        int a,b,c;
        double x,y,z;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        a = sc.nextInt();
        System.out.print("Enter the b: ");
        b = sc.nextInt();
        System.out.print("Enter the c: ");
        c = sc.nextInt();

        x = a-b/3.0+c*2-1;
        y = a-(float)b/(3+c)*(2-1);
        z = a-((float)b/(3+c)*2)-1;

        System.out.println("The x result is : "+x);
        System.out.println("The y result is : "+y);
        System.out.println("The z result is : "+z);



    }
}
