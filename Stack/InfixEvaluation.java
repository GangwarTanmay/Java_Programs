package Stack;

import java.util.Locale;
import java.util.Stack;

public class InfixEvaluation {

    public static void evaluate(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == '(')
            {
                op.push(ch);
            }

            else if(Character.isDigit(ch))  // if current character is digit
            {
                val.push(ch-'0');   // convert current character to its integer value
            }

            else if(ch == ')')
            {
                // pop operators from operator stack till ( is not encountered
                while(op.peek()!='(')
                {
                    //perform operation
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();

                    //push answer in operand stack
                    val.push(performOperation(v1, v2, operator));
                }
                op.pop();   // pop closing bracket ) too.
            }

            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                // pop till certain criteria is not met

                while(op.size()>0 && op.peek()!='(' && priority(ch) <= priority(op.peek()))
                {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    char operator = op.pop();

                    val.push(performOperation(v1, v2, operator));
                }
                // Now push current operator
                op.push(ch);
            }
        }

        while(op.size()!=0)
        {
            int v2 = val.pop();
            int v1 = val.pop();
            char operator = op.pop();

            val.push(performOperation(v1, v2, operator));
        }

        System.out.println(val.peek());

    }


    // function to perform operation on given operands and operator
    public static int performOperation(int v1, int v2, char operator)
    {
        if(operator == '+') return v1+v2;
        else if(operator == '-') return v1-v2;
        else if(operator == '*') return v1*v2;
        else  return v1/v2;
    }


    // function to return the priority of current operator
    public static int priority(char operator)
    {
        if(operator == '+') return 1;
        else if(operator == '-') return 1;
        else if(operator == '*') return 2;
        else  return 2;
    }

    public static void main(String[] args) {
        String str = "8-(5+3)*4/6";
        evaluate(str);
    }
}
