/*
Program to find two nodes in a sorted list whose sum is equal to the target sum.
input : list = 1->11->15->20->21->23
        target = 34
output : 23, 11
 */
package LinkedList;

public class TwoSum {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void findPair(Node head, int target)
    {
        Node head1 = head;
        Node tail = head;

        while(tail.next!=null)
        {
            tail = tail.next;
        }

        while(head1.data < tail.data)
        {
            if(tail.data+head1.data == target)
            {
                System.out.println(head1.data+" "+tail.data);
                return;
            }

            else if(tail.data + head1.data > target)
            {
                tail = tail.prev;
            }
            else {
                head1 = head1.next;
            }
        }
        System.out.println("No such pair is present.");
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
        Node b = new Node(12);
        Node c = new Node(14);
        Node d = new Node(16);
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
        findPair(a, 26);
    }
}
