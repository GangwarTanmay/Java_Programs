package Stack;

import java.util.Stack;

public class previousGreaterElement {

    public static int [] findGreater(int [] a)
    {
        int l = a.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[l];
        res[0] = -1;
        st.push(a[0]);

        for(int i=1 ; i<l ; i++)
        {
            while(st.size()>0 && st.peek()<a[i])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                res[i] = -1;
            }
            else
            {
                res[i] = st.peek();
            }
            st.push(a[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {88 ,57 ,44 ,92 ,28 ,66 ,60 ,37 ,33 ,52 ,38 ,29 ,76 ,8 ,75 };
        int [] res = findGreater(a);

        for (int element:
             res) {
            System.out.print(element+" ");
        }
    }
}
