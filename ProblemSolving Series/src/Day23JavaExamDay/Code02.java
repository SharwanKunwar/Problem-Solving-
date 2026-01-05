package Day23JavaExamDay;

/*
Write a Java program to convert temperature from Celsius to Fahrenheit using command-line arguments.
The program should:

1. Accept the temperature in Celsius as a command-line argument.
2. Convert the Celsius value into Fahrenheit.
3. Display the converted temperature in Fahrenheit.
 */

public class Code02 {
    static void main(String[] args) {
        double celsius = Double.parseDouble(args[0]);

        double formula = ((9*celsius)/5)+32;
        System.out.println("celsius "+celsius+" is converted into fahrenheit : "+formula);
    }
}
