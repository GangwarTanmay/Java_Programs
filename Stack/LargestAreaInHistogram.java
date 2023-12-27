package Stack;

import java.util.Stack;

public class LargestAreaInHistogram {

    public static void print(int[] a) {
        for (int element : a) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static int [] previousSmaller(int [] a)
    {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        st.push(0);
        res[0] = -1;

        for(int i=1 ; i<n ; i++)
        {
            while(st.size()>0 && a[st.peek()] > a[i])
            {
                st.pop();
            }

            if(st.size() == 0)  res[i] = -1;
            else res[i] = st.peek();

            st.push(i);
        }

        return res;
    }

    public static int [] nextSmaller(int[] a)
    {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        int [] res = new int[n];
        st.push(n-1);
        res[n-1] = n;

        for(int i=n-2 ; i>=0 ; i--)
        {
            while ((st.size()>0) && (a[st.peek()] > a[i]))
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                res[i] = n;
            }
            else {
                res[i] = st.peek();
            }
            st.push(i);
        }

        return res;
    }

    public static int findArea(int [] a)
    {
        int [] nse = nextSmaller(a);
        int [] pse = previousSmaller(a);

        int [] area = new int[a.length];
        int maxArea = Integer.MIN_VALUE;
        for(int i=0 ; i<a.length ; i++)
        {
            area[i] = a[i]*(nse[i]-pse[i]-1);
            maxArea = Math.max(maxArea, area[i]);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int [] a = {5, 2, 4, 6, 3, 5};

        System.out.println("Max area of rectangle in histogram is : "+findArea(a));
    }
}
