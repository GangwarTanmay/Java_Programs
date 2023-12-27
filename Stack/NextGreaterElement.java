/*
Program to find next greater element in an array.
Input : a[] = {1, 3, 2, 1, 8, 6, 3, 4};
Output : res [] = {3, 8, 8, 8, -1, -1, 4, -1}
 */
package Stack;

import java.util.Stack;

public class NextGreaterElement {
    public static int [] findNextGreater(int [] a)
    {
        int l = a.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[l];
        st.push(a[l-1]);
        res[l-1] = -1;

        for(int i=l-2 ; i>=0 ; i--)
        {
            while((st.size() > 0) && (st.peek() < a[i]))
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
        int [] res = findNextGreater(a);

        for (int element:
             res) {
            System.out.print(element+" ");
        }

        System.out.println();
    }
}
