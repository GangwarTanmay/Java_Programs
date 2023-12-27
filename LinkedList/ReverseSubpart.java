/*
Program to reverse a part of a linked list in the given range.
input : 11 21 23 14 15 9 12 26 12
        l = 2, m = 7
output : 11 12 9 15 14 23 21 26 12
 */

package LinkedList;

public class ReverseSubpart {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node reverse(Node head)
    {
        Node prev = null;
        Node curr = head;
        Node nextp = curr;

        while(curr!=null)
        {
            nextp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextp;
        }

        return prev;
    }

    public static void change(int m, int n, Node head)
    {
        Node first = new Node(0);
        Node second = new Node(0);
        Node third = new Node(0);
        Node temp1 = first;
        Node temp2 = second;
        Node temp3 = third;
        Node temp = head;

        for(int i=1 ; i<m ; i++)
        {
            Node x = new Node(temp.data);
            temp1.next = x;
            temp1 = x;
            temp = temp.next;
        }
        first = first.next;

        for(int i=m ; i<=n ; i++)
        {
            Node x = new Node(temp.data);
            temp2.next = x;
            temp2 = x;
            temp = temp.next;
        }
        second = second.next;
        second = reverse(second);

        temp2 = second;
        while(temp2.next!=null)
        {
            temp2 = temp2.next;
        }

        for(int i=n ;  ; i++)
        {
            if(temp == null)
            {
                break;
            }
            Node x = new Node(temp.data);
            temp3.next = x;
            temp3 = x;
            temp = temp.next;
        }
        third = third.next;
        temp1.next = second;
        temp2.next = third;

        traverse(first);
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
            Node a = new Node(11);
            Node b = new Node(21);
            Node c = new Node(23);
            Node d = new Node(14);
            Node e = new Node(15);
            Node f = new Node(9);
            Node g = new Node(12);
            Node h = new Node(26);
            Node i = new Node(12);
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next = g;
            g.next = h;
            h.next = i;

           traverse(a);
           change(2,7,a);
    }
}
