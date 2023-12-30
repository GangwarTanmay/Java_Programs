package Stack;

import java.util.Stack;

public class PrefixEvaluation {

    public static void evaluateExpression(String str)
    {
        Stack<Integer> operand = new Stack<>();
        for(int i=str.length()-1 ; i>=0 ; i--)      // in case of prefix, traverse from right to left
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                operand.push(ch-'0');
            }

            else if(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/')
            {
                int val1 = operand.pop();
                int val2 = operand.pop();

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
        String str = "-8/*+5346";
        evaluateExpression(str);
    }
}
