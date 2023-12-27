package Stack;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static class Stack{
        Node head = null; // default node
        private int size = 0;

        void push(int element)      // insert at beginning
        {
            Node x = new Node(element);
            x.next = head;
            head = x;
            size++;
        }

        int pop()
        {

            if(head == null)
            {
                System.out.println("Stack Underflow!!");
                return -1;
            }

            // if there are more than 1 node, simply delete node from beginning
            int x = head.data;
            head = head.next;
            size--;
            return x;
        }

        void display()
        {
            displayRev(head);
            System.out.println();
        }
        void displayRev(Node temp)      //display reversed list to print stack in correct order
        {
            if(temp == null)
            {
                return;
            }

            displayRev(temp.next);
            System.out.print(temp.data+" ");
        }

        int peek()
        {
            if(head == null)
            {
                System.out.println("Stack empty!!");
                return -1;
            }

            return head.data;
        }

        int size()
        {
            return size;
        }

        boolean isEmpty()
        {
            if(head == null)
            {
                return true;
            }

            else
            {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.pop();
        st.peek();
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.display();
        System.out.println(st.size());
        System.out.println(st.isEmpty());
        st.pop();
        st.display();
        System.out.println(st.peek());
    }
}
