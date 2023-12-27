package Stack;

import java.util.Stack;

public class InfixToPrefix {

    public static void performConversion(String str)
    {
        Stack<String> operand = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);

            if(ch == ' ')   // if there is a white space
            {
                continue;
            }
            if(Character.isDigit(ch))
            {
                operand.push(String.valueOf(ch));
            }

            else if(ch == '(')
            {
                operator.push(ch);
            }

            else if(ch == ')')
            {
                while(operator.peek()!='(')
                {
                    String v2 = operand.pop();
                    String v1 = operand.pop();
                    char op = operator.pop();

                    operand.push(performOperation(v1,v2,op));
                }
                operator.pop();
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
            {
                while(operator.size()>0 && operator.peek()!='(' && priority(ch)<=priority(operator.peek()))
                {
                    String v2 = operand.pop();
                    String v1 = operand.pop();
                    char op = operator.pop();

                    operand.push(performOperation(v1,v2,op));
                }
                operator.push(ch);
            }
        }

        while(operator.size()!=0)
        {
            String v2 = operand.pop();
            String v1 = operand.pop();
            char op = operator.pop();

            operand.push(performOperation(v1,v2,op));
        }

        System.out.println(operand.peek());
    }

    public static String performOperation(String v1, String v2, char operator)
    {
        String result = operator+v1+v2;
        return result;      // prefix expression of 5+2 = +52
    }

    public static int priority(char operator)
    {
        if(operator == '+') return 1;
        else if(operator == '-') return 1;
        else if(operator == '*') return 2;
        else return 2;
    }

    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        performConversion(str);
    }
}
