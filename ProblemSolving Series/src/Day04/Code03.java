package Day04;

import java.util.Scanner;

public class Code03 {
    static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first value : ");
        a = sc.nextInt();
        System.out.print("Enter your second value : ");
        b = sc.nextInt();
        System.out.print("Enter your third value : ");
        c = sc.nextInt();

        // Check for largest number
        if (a >= b && a >= c) {
            System.out.println(a + " A is the largest number");
        } else if (b >= a && b >= c) {
            System.out.println(b + " B is the largest number");
        } else {
            System.out.println(c + " C is the largest number");
        }
    }
}
