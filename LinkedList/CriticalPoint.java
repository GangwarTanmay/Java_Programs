/*
Critical point : if at any point, (temp.prev < temp > temp.next) or (temp.prev > temp < temp.next), then that node is a critical point
 */
package LinkedList;

public class CriticalPoint {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node (int data)
        {
            this.data = data;
        }
    }

    public static void findPoints(Node head)
    {
        Node temp = head;
        temp = temp.next;

        while(temp.next!=null)     // head and tail cannot be critical points so avoid them
        {
            if((temp.data > temp.next.data && temp.data > temp.prev.data) || (temp.data < temp.next.data && temp.data < temp.prev.data))
            {
                System.out.print(temp.data + " ");
            }
            temp = temp.next;
        }
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
        Node a = new Node(10);
        Node b = new Node(21);
        Node c = new Node(20);
        Node d = new Node(25);
        Node e = new Node(18);
        a.next = b;
        a.prev = null;

        b.next = c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.next = e;
        d.prev = c;

        e.next = null;
        e.prev = d;

        traverse(a);
        findPoints(a);
    }
}
