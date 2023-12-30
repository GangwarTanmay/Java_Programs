/*
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right.
You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation:
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
 */
package Stack;

import java.util.Stack;

public class slidingWindowMaximum {

    public static int [] NextGreater(int [] a, int n)
    {
        Stack<Integer> st = new Stack<>();
        int [] result = new int[n];
        result[n-1] = n;
        st.push(n-1);

        for(int i = n-2 ; i>=0 ; i--)
        {
            while (st.size()>0 && a[st.peek()] <= a[i])     st.pop();

            if(st.size() == 0)  result[i] = n;
            else    result[i] = st.peek();

            st.push(i);
        }

        return result;
    }

    public static void findMaximum(int []  a, int k)
    {
        int [] nge = NextGreater(a, a.length);
        int [] result = new int[a.length-k+1];

        int m=0;
        for(int i=0 ; i<a.length-k+1 ; i++)
        {
            int j = i;

            while(nge[j]<i+k)   j = nge[j];     // move to next element if index of next greater element of jth element is inside the window

            // if next greater element of ith element is outside the window, then jth element is the maximum element in the current window
            result[m] = a[j];
            m++;
        }

        for (int val:
             result) {
            System.out.print(val+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;  // window size
        findMaximum(arr, k);
    }
}
