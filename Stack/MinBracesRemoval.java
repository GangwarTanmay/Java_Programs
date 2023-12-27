/*
 Program to find minimum number of brackets to be removed to make a sequence balanced
 Input : (()()
 Output : 1

 Input : )()())
 Output : 2
 */
package Stack;

import java.util.Stack;

public class MinBracesRemoval {

    public static int remove(String st)
    {
        int count = 0;
        Stack<Character> s = new Stack<>();

        for(int i=0 ; i<st.length() ; i++)
        {
            char ch = st.charAt(i);

            if(ch == '(')   s.push(ch);

            else {
                if(s.size() == 0)   count++;
                else
                    if(s.peek() == '(')   s.pop();
            }
        }

        count = count+s.size();
        return count;
    }

    public static void main(String[] args) {
        String st1 = "(()(()";
        String st2 = ")()()()()))";

        System.out.println(remove(st1));
        System.out.println(remove(st2));
    }
}
