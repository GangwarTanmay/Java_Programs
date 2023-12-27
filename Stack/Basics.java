package Stack;

import java.util.Stack;

public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(6);
        st.push(9);
        st.push(2);
        st.push(3);
        System.out.println(st);
        System.out.println(st.size());

        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
    }
}
