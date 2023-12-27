/*
 Program to remove all the consecutive subsequences of length greater than or equal to 2 that contains the same element.
 input : a = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2}
 output = {1, 3, 5, 2}
 */
package Stack;

import java.util.Stack;

public class RemoveConsecutiveSubsequences {

    public static int [] remove(int [] a)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<a.length ; i++)
        {
            if(st.size() == 0)  st.push(a[i]);

            else {
                if(st.peek() == a[i])
                {
                    if(a[i]!=a[i+1] || i==a.length-1)
                    {
                        st.pop();
                    }
                }

                else {
                    st.push(a[i]);
                }
            }
        }

        int [] ans = new int[st.size()];
        int index = ans.length-1;

        while(st.size()>0)
        {
            ans[index] = st.pop();
            index--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};

        // new array

        int[] A = remove(a);
        for (int element:
             A) {
            System.out.print(element+" ");
        }

        System.out.println();
    }
}
