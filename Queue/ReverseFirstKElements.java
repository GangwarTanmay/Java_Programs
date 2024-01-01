/*
Program to reverse first k elements of queue.
input : q = [1,2,3,4,5]     k = 3
output : q = [3,2,1,4,5]
 */
package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElements {

    public static void reverse(Queue<Integer> q, int k)
    {
        Stack<Integer> st = new Stack<>();
        int a = 1;
        while(a<=k)
        {
            st.push(q.poll());
            a++;
        }

        Queue<Integer> temp = new LinkedList<>();

        while(q.size()>0)
        {
            temp.add(q.poll());
        }

        while(st.size()>0)
        {
           q.add(st.pop());
        }

        while(temp.size()>0)
        {
            q.add(temp.poll());
        }

        System.out.println(q);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        reverse(q, 3);
    }
}
