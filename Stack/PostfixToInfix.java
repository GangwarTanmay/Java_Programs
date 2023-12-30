package Stack;

import java.util.Stack;

public class PostfixToInfix {

    public static String performOperation(String val1, String val2, char operator)
    {
        return String.valueOf(val1+operator+val2);  // return infix expression
    }

    public static void convert(String str)
    {
        Stack<String> operand = new Stack<>();

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);

            if(Character.isDigit(ch))
            {
                operand.push(String.valueOf(ch));
            }

            else if(ch == '+' ||ch == '-' ||ch == '*' ||ch == '/')
            {
                String val2 = operand.pop();
                String val1 = operand.pop();

                operand.push(performOperation(val1, val2, ch));
            }
        }

        System.out.println(operand.peek());
    }

    public static void main(String[] args) {
        String str = "953+4*6/-";
        convert(str);
    }
}
