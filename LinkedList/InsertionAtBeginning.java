package LinkedList;

import java.util.Scanner;

public class InsertionAtBeginning {
    public static class Node{
        int data;
        Node next;
    }

    public static class linkedList{
        static Node head = null;   //Initially head and tail will be null
        static Node tail = null;
        void insert(int x)
        {
            Node newNode = new Node();
            newNode.data = x;

            if(head == null)
            {
                head = newNode;
                tail = newNode;
            }

            else {
                newNode.next = head;    //Connect head with newNode
                head = newNode;         // update head with newNode
            }
        }

        void traverse()
        {
            Node temp = head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        Scanner sc = new Scanner(System.in);
        int i=0;
        while(i<=5)
        {
            int data = sc.nextInt();
            l1.insert(data);
            l1.traverse();
            System.out.println();
            i++;
        }
    }
}
