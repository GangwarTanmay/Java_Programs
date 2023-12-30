package Stack;

import java.util.Stack;

public class PrefixToPostfix {

    public static void evaluateExpression(String str)
    {
        Stack<String> operand = new Stack<>();

        for(int i=str.length()-1; i>=0 ; i--)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                operand.push(String.valueOf(ch));
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                String val1 = operand.pop();
                String val2 = operand.pop();

                operand.push(performOperation(val1, val2, ch));
            }
        }

        System.out.println(operand.peek());
    }

    public static String performOperation(String val1, String val2, char operator)
    {
        return String.valueOf(val1+val2+operator);  // return postfix expression
    }

    public static void main(String[] args) {
        String str = "-9/*+5346";
        evaluateExpression(str);
    }
}
