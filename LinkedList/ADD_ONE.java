/*
 Program to add 1 to the numerical value of a linked list
 ex. 9->9->9->9
 output : 1->0->0->0->0
 explanation : 9999 + 1 = 10000
 */

package LinkedList;

public class ADD_ONE {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node Reverse(Node head)
    {
        Node prev = null;
        Node nextp = null;
        Node curr = head;

        while(curr != null)
        {
            nextp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextp;
        }

        head = prev;
        return head;
    }

    public static void add(Node head1) {
        Node prev = null;
        Node nextp = null;
        Node curr = head1;

        while(curr != null)
        {
            nextp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextp;
        }

        head1 = prev;
        Node temp = head1;
        int carry = 0;
        temp.data = temp.data + 1;
        if(temp.data > 9)
        {
            temp.data = temp.data%10;
            carry = 1;
        }

        while(carry == 1)
        {
            carry = 0;
            temp.next.data = temp.next.data + 1;
            if(temp.next.data > 9)
            {
                temp.next.data = temp.next.data%10;
                carry = 1;
                temp = temp.next;
            }
            if(temp.next == null)
            {
                Node x = new Node(1);
                temp.next = x;
                temp = x;
                break;
            }
        }

        head1 = Reverse(head1);
        traverse(head1);
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
        Node a = new Node(9);
        Node b = new Node(9);
        Node c = new Node(9);
        Node d = new Node(9);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;

        e.next = f;
        f.next = g;
        g.next = h;
        h.next = i;
        i.next = null;
        e.data = e.data+1;

        Node head1 = a;
        Node head2 = e;

        traverse(head1);
        add(head1);
    }
}
