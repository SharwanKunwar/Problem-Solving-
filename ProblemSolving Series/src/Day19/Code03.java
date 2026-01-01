package Day19;

// WAP in Java to evaluate a prefix expression using Stack

import java.util.Stack; // Import Stack class from java.util package

// Class to handle prefix expression evaluation
class Prefix {

    // Method to evaluate prefix expression
    public static int evaluate(String exp) {
        Stack<Integer> stack = new Stack<>(); // Stack to store operands

        // Traverse the expression from right to left
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i); // Get current character

            // If character is a digit (operand), push it to stack
            if (Character.isDigit(ch)) {
                stack.push(ch - '0'); // Convert char to int
            } else {
                // If character is an operator, pop two operands from stack
                int num1 = stack.pop(); // First popped (left operand)
                int num2 = stack.pop(); // Second popped (right operand)

                // Apply the operator and push result back to stack
                switch (ch) {
                    case '+':
                        stack.push(num1 + num2); // Addition
                        break;
                    case '-':
                        stack.push(num1 - num2); // Subtraction
                        break;
                    case '*':
                        stack.push(num1 * num2); // Multiplication
                        break;
                    case '/':
                        stack.push(num1 / num2); // Division
                        break;
                }
            }
        }

        // The final result will be at the top of the stack
        return stack.pop();
    }
}

// Main class to run the program
public class Code03 {

    // Main method - program entry point
    public static void main(String[] args) {
        String exp = "-+2*123"; // Prefix expression to evaluate
        int result = Prefix.evaluate(exp); // Call evaluate method
        System.out.println("The result is : " + result); // Print result
    }
}
