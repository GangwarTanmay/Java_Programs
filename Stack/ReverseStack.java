// Program to reverse stack using recursion
package Stack;

import java.util.Stack;

public class ReverseStack {

    public static void pushAtBottom(Stack<Integer> st, int element)
    {
        if(st.size() == 0)
        {
            st.push(element);
            return;
        }

        int x = st.pop();
        pushAtBottom(st, element);
        st.push(x);
    }

    public static void reverse(Stack<Integer> st)
    {
        if(st.size() == 1)
        {
            return;     //single element is already reversed
        }

        int x = st.pop();
        reverse(st);
        pushAtBottom(st,x);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println("Original stack : "+st);
        reverse(st);
        System.out.println("Reverse stack : "+st);
    }
}
