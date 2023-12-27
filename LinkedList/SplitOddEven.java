package LinkedList;
/*
 Program to split given list into list of elements at odd indices and elements at even indices.
 example : 1->2->3->4->5->6

 output : 1->3->5   (element at odd indices)
          2->4->6   (element at even indices)
 */

public class SplitOddEven {
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

    public static void Remove(Node head)
    {
        Node odd = new Node(10);
        Node even = new Node(10);
        Node tempa = odd;
        Node tempb = even;
        Node temp1 = head;
        Node temp2 = head.next;

        while(temp1!=null)
        {
            Node x = new Node(temp1.data);
            tempa.next = x;
            tempa = x;
            if(temp1.next==null)
            {
                break;
            }
            temp1 = temp1.next.next;
        }

        while(temp2!=null)
        {
            Node x = new Node(temp2.data);
            tempb.next = x;
            tempb = x;
            if(temp2.next==null)
            {
                break;
            }
            temp2 = temp2.next.next;
        }

        odd = odd.next;
        even = even.next;

        even = reverse(even);
        tempa.next = even;
        traverse(odd);
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
        Node b = new Node(12);
        Node c = new Node(15);
        Node d = new Node(13);
        Node e = new Node(17);
        Node f = new Node(18);
        Node g = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        Node head = a;
        traverse(head);
        Remove(head);
    }
}
