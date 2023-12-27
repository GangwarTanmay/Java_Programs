/*
You are given N elements and your task is to Implement a Stack in which you can get a minimum element in O(1) time.
Input:push(2)
      push(3)
      pop()
      getMin()
      push(1)
      getMin()
Output: 2 1
 */
package Stack;

import java.util.Stack;

public class minStack {

    public static class stack{
        int [] s;
        int currIndex = -1;
        Stack<Integer> min;
        stack(int x)
        {
            s = new int[x];
            min = new Stack<>();
        }
        void print()
        {
           for(int i=0 ; i<=currIndex ; i++)
           {
               System.out.print(s[i]+" ");
           }
            System.out.println();
        }

        int pop()
        {
            int x = s[currIndex];
            min.pop();
            currIndex--;
            return x;
        }

        void push(int x) {
            currIndex++;

            if(currIndex >= s.length)
            {
                System.out.println("Stack Overflow!!");
                return;
            }
            s[currIndex] = x;
            if (min.size() == 0) {
                min.push(x);
            } else {
                min.push(Math.min(min.peek(), x));
            }
        }

        int getMin()
        {
            return min.peek();
        }
    }

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(7);
        System.out.println(s.getMin());
        s.push(6);
        System.out.println(s.getMin());
        s.push(3);
        System.out.println(s.getMin());
        s.push(2);
        System.out.println(s.getMin());
        s.push(0);
        System.out.println(s.getMin());
        s.print();
        s.pop();
        s.print();
        System.out.println(s.getMin());
    }
}
