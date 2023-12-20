/*
 Program to put all elements at odd indices at beginning of the linked and elements at even indices at end.
 input : list = 1->2->3->4->5
 output : list = 1->3->5->2->4
 */
package LinkedList;

public class Rearrange {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static Node rearrange(Node head)
    {
         Node odd = new Node(0);
         Node even = new Node(0);
         Node tempo = odd;
         Node tempe = even;
         Node temp = head;

         while(temp!=null)
         {
             Node x = new Node(temp.data);
             tempo.next = x;
             tempo = x;
             temp = temp.next;

             if(temp == null)
             {
                 break;
             }

             Node y = new Node(temp.data);
             tempe.next = y;
             tempe = y;
             temp = temp.next;
         }

         odd = odd.next;
         even = even.next;
         tempo.next = even;
         return odd;
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
        traverse(head);
        head = rearrange(head);
        traverse(head);
    }
}
