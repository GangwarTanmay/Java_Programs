package Queue;

import java.util.Stack;

public class QueueUsingStack {

    // push efficient queue using stack
    public static class QS{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        void add(int x)
        {
            st.push(x);
        }

        int remove()
        {
            while(st.size()>1)
            {
                helper.push(st.pop());
            }

            int x = st.pop();

            while(helper.size()>0)
            {
                st.push(helper.pop());
            }
            return x;
        }

        int peek()
        {
            while(st.size()>1)
            {
                helper.push(st.pop());
            }

            int x = st.peek();

            while(helper.size()>0)
            {
                st.push(helper.pop());
            }
            return x;
        }
    }

    // pop efficient queue using stack
    public static class QS2{
        Stack<Integer> st = new Stack<>();
        Stack<Integer> helper = new Stack<>();

        void add(int x)
        {
            while(st.size()>0)
            {
                helper.push(st.pop());
            }

            st.push(x);

            while(helper.size()>0)
            {
                st.push(helper.pop());
            }
        }

        int remove()
        {
            return st.pop();
        }

        int peek()
        {
            return st.peek();
        }
    }

    public static void main(String[] args) {
        QS2 q = new QS2();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println(q.peek());

        System.out.println(q.remove());
    }
}
