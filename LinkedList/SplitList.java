// given a linked list, split it into two lists such that one contains odd value, while the other contains even values
package LinkedList;

public class SplitList {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void split(Node head)
    {
        Node temp = head;
        Node head1 = new Node(11);
        Node head2 = new Node(11);
        Node temp1 = head1;
        Node temp2 = head2;

        while(temp!=null)
        {
            if((temp.data)%2 == 0)
            {
                Node newNode = new Node(temp.data);
                temp1.next = newNode;
                temp1 = newNode;
                temp = temp.next;
            }

            else {
                Node newNode = new Node(temp.data);
                temp2.next = newNode;
                temp2 = newNode;
                temp = temp.next;
            }
        }

        head1 = head1.next;
        head2 = head2.next;

        System.out.println("List of even elements : ");
        traverse(head1);
        System.out.println("List of odd elements : ");
        traverse(head2);
    }

    public static void traverse(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(24);
        Node b = new Node(11);
        Node c = new Node(18);
        Node d = new Node(14);
        Node e = new Node(12);
        Node f = new Node(17);
        Node g = new Node(20);
        Node h = new Node(13);
        Node i = new Node(26);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        Node head = a;
        System.out.println("Original list : ");
        traverse(head);
        split(head);
    }
}
