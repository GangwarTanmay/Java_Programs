// Program to remove nth node from the end of the array.
package LinkedList;

public class RemoveLastNthNode {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static int size;

    public static Node remove(Node head, int index)
    {

        if(index == size)
        {
            head = head.next;       // just update the head
            return head;            // and return head
        }
        Node slow = head;
        Node fast = head;

        for(int i=1 ; i<=index ; i++)
        {
            fast = fast.next;
        }

        while(fast.next!=null)
        {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
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
        Node a = new Node(54);
        Node b = new Node(32);
        Node c = new Node(97);
        Node d = new Node(11);
        Node e = new Node(83);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node head = a;

        traverse(head);
        head = remove(head,5);      // update head
        traverse(head);
    }
}
