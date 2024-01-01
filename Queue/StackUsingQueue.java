package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

    // push efficient Stack using queue
    public static class SQ
    {
        Queue<Integer> q = new LinkedList<>();

        void add(int x)
        {
            q.add(x);
        }

        int pop()
        {   if(q.size() == 0)   return -1;
            for(int i=1 ; i<=q.size()-1 ; i++)
            {
                q.add(q.remove());
            }

            int x = q.remove();
            return x;
        }

        int peek()
        {
            if(q.size() == 0)   return -1;
            for(int i=1 ; i<=q.size()-1 ; i++)
            {
                q.add(q.remove());
            }

            int x = q.remove();
            q.add(x);
            return x;
        }

    }

    // pop efficient stack using queue
    public static class SQ2
    {
        Queue<Integer> q = new LinkedList<>();

        void add(int x)
        {
            q.add(x);
            for(int i=1 ; i<=q.size()-1 ; i++)
            {
                q.add(q.remove());
            }
        }

        int pop()
        {
            if (q.size() == 0)  return -1;
            return q.remove();
        }

        int peek()
        {
            if(q.size() == 0)   return -1;
            return q.peek();
        }
    }

    public static void main(String[] args) {
        SQ2 s = new SQ2();
        s.add(10);
        s.add(20);
        s.add(30);
        s.add(40);
        s.add(50);
        System.out.println(s.peek());
        s.pop();
        s.add(99);
        System.out.println(s.peek());
    }
}
