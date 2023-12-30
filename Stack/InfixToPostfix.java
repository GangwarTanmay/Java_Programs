package Stack;

import java.util.Stack;

public class InfixToPostfix {

    public static void performConversion(String str)
    {
        Stack<Character> operator = new Stack<>();
        Stack<String> operand = new Stack<>();

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);

            if(ch>=97 && ch<=122)
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
                    String val2 = operand.pop();
                    String val1 = operand.pop();
                    char op = operator.pop();

                    operand.push(performOperation(op, val1, val2));
                }
                operator.pop();
            }

            else if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^')
            {
                while(operator.size()>0 && operator.peek()!='(' && priority(operator.peek())>=priority(ch))
                {
                    String val2 = operand.pop();
                    String val1 = operand.pop();
                    char op = operator.pop();

                    operand.push(performOperation(op, val1, val2));
                }
                operator.push(ch);
            }
        }

        while(operator.size()!=0)
        {
            String val2 = operand.pop();
            String val1 = operand.pop();
            char op = operator.pop();

            operand.push(performOperation(op, val1, val2));
        }

        System.out.println(operand.peek());
    }

    public static int priority(char operator)
    {
        if(operator == '+') return 1;
        else if(operator == '-') return 1;
        else if(operator == '*') return 2;
        else if(operator == '^') return 3;
        else return 2;
    }

    public static String performOperation(char operator, String operand1, String operand2)
    {
        return operand1+operand2+operator;
    }

    public static void main(String[] args) {
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        performConversion(str);
    }
}
