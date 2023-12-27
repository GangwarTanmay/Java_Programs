// Program to remove element from the bottom of stack
package Stack;

import java.util.Stack;

public class RemoveFromBottom {

    public static void popFromBottom(Stack<Integer> st)
    {
        if(st.size() == 1)
        {
            st.pop();
            return;
        }
        int x = st.pop();
        popFromBottom(st);
        st.push(x);
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

        popFromBottom(st);
        System.out.println(st);
    }
}
