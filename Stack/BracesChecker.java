package Stack;

import java.util.Stack;

public class BracesChecker {

    public static boolean check(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length() ; i++)
        {
            char ch = s.charAt(i);
            if(ch == '(') st.push(ch);

            if(ch == '[') st.push(ch);

            if(ch == '{') st.push(ch);

            if(ch == ')')
            {
                if(st.size() == 0) return false;

                else {
                    if (st.peek() == '(') st.pop();
                    else return false;
                }
            }

            if(ch == ']')
            {
                if(st.size() == 0) return false;

                else {
                    if (st.peek() == '[') st.pop();
                    else return false;
                }
            }

            if(ch == '}')
            {
                if(st.size() == 0) return false;

                else {
                    if (st.peek() == '{') st.pop();
                    else return false;
                }
            }
        }

        if(st.size()>0) return false;
        return true;
    }

    public static void main(String[] args) {
        String st1 = "{}{(}))}";
        String st2 = "][](){}";
        String st3 = "[](){[]}";

        System.out.println(st1+" : "+check(st1));
        System.out.println(st2+" : "+check(st2));
        System.out.println(st3+" : "+check(st3));
    }
}
