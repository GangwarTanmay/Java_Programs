// Program to push at the bottom of stack using recursion.
package Stack;

import java.util.Stack;

public class InsertAtBottom {
    public static void reverseStack(Stack<Integer> st)
    {
        if(st.size() == 0)
        {
            return;
        }

        int x = st.pop();
        reverseStack(st);
        st.push(x);
    }

    public static void pushAtBottom(Stack<Integer> st, int element)
    {
        if(st.size() == 0)
        {
            st.push(element);
            return;
        }

        int x = st.pop();
        pushAtBottom(st,element);
        st.push(x);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        pushAtBottom(st,10);
        reverseStack(st);
        System.out.println(st);
    }
}
