package Queue;

public class LinkedListImplementation {
    public static class Node
    {
        int data;
        Node next;

        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    public static class queue
    {
        private Node head = null;
        private Node tail = null;
        private int size = 0;   // private -> so that it is not directly accessible outside the class

        void add(int x)
        {
            Node temp = new Node(x);

            if(head == null)
            {
                head = temp;
                tail = temp;
            }
            else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        int peek()
        {
            if(head == null)
            {
                System.out.println("Queue is empty!!");
                return -1;
            }
            return head.data;
        }

        int getSize()
        {
            return size;
        }

        int remove()
        {
            if(head == null)
            {
                System.out.println("Queue is empty!!");
                return -1;
            }
            else {
                int x = head.data;
                head = head.next;
                size--;
                return x;
            }
        }

        void traverse()
        {
            Node temp = head;
            System.out.print("[");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        System.out.println(q.getSize());
        q.traverse();

        q.add(15);
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.add(19);
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.add(26);
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.add(35);
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.remove();
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.remove();
        System.out.println("size : "+q.getSize());
        q.traverse();
        q.add(97);
        q.traverse();
    }
}
