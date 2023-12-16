package LinkedList;

public class Basic {
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static void traverse(Node temp)
    {
        int size = 0;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
            size++;
        }
        System.out.println("\nSize of list : "+size);
    }

    public static void traverseRecursively(Node temp)
    {
        if(temp!=null)
        {
            System.out.print(temp.data+" ");
            traverseRecursively(temp.next);
        }
        else
        {
            return;
        }
    }

    public static void findLengthRecursively(Node temp, int size){
        if(temp == null)
        {
            System.out.println("\nLength = "+size);
            return;
        }
        findLengthRecursively(temp.next, size+1);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(34);
        Node c = new Node(45);
        Node d = new Node(78);
        Node e = new Node(90);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        traverse(a);   // traverse from node a
        traverseRecursively(a);   // traverse recursively from node a
        findLengthRecursively(a,0); //Initially assume length 0
    }
}
