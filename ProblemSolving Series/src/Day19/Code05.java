package Day19;
import java.util.Stack;

// class to convert infix to prefix
class InfixToPrefix{

    // return precedence of operators
    static int precedence(char op){
        switch (op){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return 0;
    }

    // convert infix to postfix (helper method)
    static String infixToPostfix(String infix){
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
                while(!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)){
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    // convert infix to prefix
    public static String convert(String infix){
        // Step 1: reverse infix
        String reversed = new StringBuilder(infix).reverse().toString();

        // Step 2: swap '(' and ')'
        StringBuilder modified = new StringBuilder();
        for(char ch : reversed.toCharArray()){
            if(ch == '(') modified.append(')');
            else if(ch == ')') modified.append('(');
            else modified.append(ch);
        }

        // Step 3: convert modified infix to postfix
        String postfix = infixToPostfix(modified.toString());

        // Step 4: reverse postfix → prefix
        return new StringBuilder(postfix).reverse().toString();
    }
}

// main class
public class Code05 {
    public static void main(String[] args){
        String infix = "A+B*C";
        String prefix = InfixToPrefix.convert(infix);
        System.out.println("The prefix expression : " + prefix);
    }
}
