/*
    Program to reverse a linked list.
    input : 1->2->3->4->5->null
    output : 5->4->3->2->1->null
 */

package LinkedList;

public class ReverseList {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public static Node split(Node head) {
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
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
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
        Node newHead = new Node(10);
        Node temp2 = newHead;
        Node temp1 = head;
        while(temp1!=null)
        {
            Node x = new Node(temp1.data);
            temp2.next = x;
            temp2 = x;
            temp1 = temp1.next;
        }
        newHead = newHead.next;
        System.out.println("Original list : ");
        traverse(head);
        Node head2 =  split(head);
        traverse(head2);
        traverse(newHead);
    }
}
