package Day19;
import java.util.Stack;

// wap in java to convert infix to postfix expression.

class InfixToPostfix{

    // method to return precedence of operators
    static int precedence(char op){
        switch (op){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }

    // method to convert infix to postfix
    public static String convert(String infix){
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                postfix.append(ch);
            }else if(ch == '('){
                stack.push(ch);
            }else if(ch == ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }else{
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while (!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
}


public class Code04 {
    static void main(String[] args) {
        String infix = "A+B*C";
        String postfix = InfixToPostfix.convert(infix);
        System.out.println("The postfix expression : "+postfix);

    }
}
