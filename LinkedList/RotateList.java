/*
Program to rotate a list k times:
input : list = 1->2->3->4->5
        k = 2
output : list = 4->5->1->2->3

Approach : just append k nodes from end to start of the list
 */
package LinkedList;

public class RotateList {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }
    // function to rotate anti-clockwise
    public static Node Rotate(Node head, int k)
    {
        Node temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }

        k = k%size;     // if size = 6 and k = 7 then list can be rotated 1 time to get resultant list
                        // for k = 1, list = 6->1->2->3->4->5
                        // also for for k = 7, list = 6->1->2->3->4->5

        if(k == 0)
        {
            return head;
        }
        Node temp1 = head;
        Node temp2 = head;

        for(int i=1 ; i<=k ; i++)
        {
            temp1 = temp1.next;
        }

        while(temp1.next!=null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        Node temp3 = temp2.next;
        temp2.next = null;
        temp1.next = head;
        head = temp3;

        return head;
    }

    // function to rotate clockwise
    public static Node rotateClockwise(Node head, int k)
    {
        Node temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }

        k = k % size;

        if(k == 0)
        {
            return head;
        }

        Node temp1 = head;
        for(int i=1 ; i<k ; i++)
        {
            temp1 = temp1.next;
        }

        Node temp2 = temp1.next;

        while(temp2.next!=null)
        {
            temp2 = temp2.next;
        }
        temp2.next = head;
        head = temp1.next;
        temp1.next = null;

        return head;
    }

    public static void traverse(Node head)
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"  ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        traverse(a);
//        Node head = Rotate(a, 2);
//        traverse(head);

        Node head = rotateClockwise(a, 3);
        traverse(head);
    }
}
