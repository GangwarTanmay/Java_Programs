package Stack;

import java.util.Stack;

public class PostfixEvaluation {

    public static void evaluateExpression(String str)
    {
        Stack<Integer> operand = new Stack<>();
        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))   // if current character is digit(number)
            {
                operand.push(ch-'0');   // find integral value of character
            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {    // if current character is operator
                int val2 = operand.pop();
                int val1 = operand.pop();

                operand.push(performOperation(val1, val2, ch));
            }
        }

        System.out.println(operand.peek());
    }

    public static int performOperation(int val1, int val2, char operator)
    {
        if(operator == '+')     return val1+val2;
        else if(operator == '-')     return val1-val2;
        else if(operator == '*')     return val1*val2;
        else     return val1/val2;
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        evaluateExpression(str);
    }
}
