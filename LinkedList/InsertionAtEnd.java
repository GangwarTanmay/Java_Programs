package LinkedList;

import java.util.Scanner;

public class InsertionAtEnd {

    public static class Node{
        int data;
        Node next;
    }

    public static class linkedList{     // class to implement Linked List

        static Node head = null;   // initially head and tail will be pointing to null
        static Node tail = null;

         void insert(int data)
        {
            Node newNode = new Node();  // create new node
            newNode.data = data;

            if(head == null)
            {
                head = newNode;   // if list is empty, then newNode will be the head (first) node;
                tail = head;
            }
            else {
                tail.next = newNode;        // append the newly created node at the tail(end) of the list
                newNode.next = null;
                tail = newNode;             // since newNode is inserted at the end so now the newNode would be the tail.
            }
        }

        void traverse()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insert(20);
        l1.insert(40);
        l1.insert(87);
        l1.insert(38);
        l1.insert(8);

        l1.traverse();
    }
}
