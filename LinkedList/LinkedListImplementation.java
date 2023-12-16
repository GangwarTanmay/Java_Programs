package LinkedList;

public class LinkedListImplementation {

    public static class Node{
        int data;
        Node next;

    }

    public static class linkedList{

        static Node head = null;
        static Node tail = null;
        static int size = 0;        // variable to get size of linked list

        void insertAtIndex(int data, int index)     // function to insert an element at given index
        {

            if(index == 0)      // if index is 0 then simply insert at beginning
            {
                insertAtBeginning(data);
                return;
            }

            else if(index == size)     // if index is equal to length of list then simply insert at end
            {
                insertAtEnd(data);
                return;
            }

            else
            {
            int i=1;
            Node temp = head;
            Node newNode = new Node();
            newNode.data = data;
            while (i <= index - 1) {
                i++;
                temp = temp.next;   // move temp pointer till i<index
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;     // after each insertion, size will be increased
        }
        }

        void insertAtBeginning(int x)       // function to insert element at beginning of list
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
            size++;     // after each insertion, size will be increased
        }

        void insertAtEnd(int data)      // function to insert at the end of the list
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
            size++;     // after each insertion, size will be increased
        }

        void deletionAtIndex(int index)
        {
            if(index == 0)      // deletion will be performed on first node
            {
                head = head.next;  // if index=0, then simply move(update) head pointer
                size--;     // after each deletion, size will be decreased
                return;
            }

            else {
                Node temp = head;
                for (int i = 1; i <= index - 1; i++) {
                    temp = temp.next;
                }

                temp.next = temp.next.next;
                size--;     // after each deletion, size will be decreased


                // also update tail pointer if deletion is performed on last node(i.e., if index was == size-1)
                if (index == size) {
                    tail = temp;
                }
            }
        }

        void traverse()     // function to traverse the list
        {
            Node temp = head;
            while (temp!=null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getElement(int index)       // function to return element at given index
        {
            int i=1;
            Node temp = head;
            while(i<index)
            {
                temp = temp.next;
                i++;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        linkedList l1 = new linkedList();
        l1.insertAtEnd(34);
        l1.insertAtEnd(36);
        l1.insertAtEnd(32);
        l1.insertAtEnd(39);

        int data = 78;
        int index = 3;
        l1.insertAtIndex(data,index);
        l1.traverse();
        l1.deletionAtIndex(0);
        l1.traverse();
    }
}
