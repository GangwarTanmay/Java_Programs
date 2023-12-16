package LinkedList;

public class NthNodeFromLast {
    public static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    static int size;

    public static int LastNthNode(Node head, int x)
    {
        Node temp = head;

        if(x>size)
        {
            return -1;
        }
        int y = size-x+1;
        while(y>1)
        {
            temp = temp.next;
            y--;
        }
        return temp.data;
    }

    public static int LastNth(Node head, int index)     //function to return last nth node in one traversal
    {
        if(index > size)
        {
            return -1;
        }

        Node slow = head;
        Node fast = head;

        for(int i=1 ; i<=index ; i++)
        {
            fast = fast.next;
        }

        while(fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }

    public static void traverse(Node head)
    {
        size = 0;
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
            size++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(12);
        Node b = new Node(42);
        Node c = new Node(16);
        Node d = new Node(19);
        Node e = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node head = a;

        traverse(head);
        System.out.println(size);

        System.out.println(LastNthNode(head,6));
        System.out.println(LastNth(head,4));
    }
}
