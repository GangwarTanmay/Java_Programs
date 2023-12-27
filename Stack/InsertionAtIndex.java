package Stack;

import java.util.Stack;

public class InsertionAtIndex {

    public static Stack<Integer> st = new Stack<>();

    public static void insertAt(int element, int index)
    {
        Stack<Integer> temp = new Stack<>();
        while(st.size()>index)
        {
            temp.push(st.pop());
        }
        st.push(element);

        while(temp.size()>0)
        {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println(st);
        insertAt(13,7);
        System.out.println(st);
    }
}
