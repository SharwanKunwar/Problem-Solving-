package Day23JavaExamDay;

/*
Write a Java program that accepts the length and breadth of a rectangle as command-line arguments. The program should:
1. Convert the command-line arguments into integers.
2. Calculate the area of the rectangle.
3. Calculate the perimeter of the rectangle.
4. Display the area and perimeter on the screen.
 */

public class Code01 {
    static void main(String[] args) {

        int length = Integer.parseInt(args[0]);
        int breadth = Integer.parseInt(args[1]);

        int area = length*breadth;
        int perimeter = 2*(length+breadth);

        System.out.println("The are of the rectangle is : "+area);
        System.out.println("The perimeter of the rectangle is : "+perimeter);

    }
}
