package Stack;

import java.util.Stack;

public class StackCopy {
    public static void makeReverseCopy(Stack<Integer> st)
    {
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0)
        {
                                       //It performs similar as, int x = st.peek();
              rt.push(st.pop());       //                        rt.push(x);
                                       //                        st.pop();
        }

        System.out.println("Original Stack : "+st);
        System.out.println("Reverse Stack : "+rt);
    }

    public static void makeCopy(Stack<Integer> st) {
        // make auxiliary stack
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0)
        {
            rt.push(st.pop());
        }

        // make final stack
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0)
        {
            gt.push(rt.pop());
        }

        System.out.println("Copied Stack : "+gt);
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

        System.out.println(st);
        //makeReverseCopy(st);
        makeCopy(st);
    }
}
