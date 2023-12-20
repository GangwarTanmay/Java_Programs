package LinkedList;

public class DoublyLinkedList {
    public static class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
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

    public static void traverseReverse(Node tail)
    {
        Node temp = tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(14);
        Node c = new Node(19);
        Node d = new Node(17);
        Node e = new Node(13);
        a.next = b;

        b.next = c;
        b.prev = a;

        c.next = d;
        c.prev = b;

        d.next = e;
        d.prev = c;

        e.prev = d;

        traverse(a);
        traverseReverse(e);
    }
}
