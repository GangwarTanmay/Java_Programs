package LinkedList;

public class DoublyLinkedListImplementation {
    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
        }
    }

    public static class DLinkedList{
        static Node head = null;
        static Node tail = null;
        static int size = 0;

        void insertAtHead(int t)
        {
            Node temp = new Node(t);
            size++;     //increase size after each insertion
            if(head == null)
            {
                head = temp;
                tail = temp;    // if there is only one node, then head and tail will point to the same node
                return;
            }
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        void insertAtIndex(int t, int index)   // follow 0 based indexing
        {
            if(index == 0)
            {
                insertAtHead(t);
                return;
            }

            if(index == size)
            {
                insertAtEnd(t);
                return;
            }
            Node temp = head;
            for(int i=1 ; i<index ; i++)
            {
                temp = temp.next;
            }

            Node x = new Node(t);
            x.next = temp.next;
            temp.next.prev = x;
            temp.next = x;
            x.prev = temp;
            size++;
        }

        void insertAtEnd(int t)
        {
            Node x = new Node(t);
            tail.next = x;
            x.prev = tail;
            tail = x;   //also update tail
            size++;
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

        void deleteAtHead()
        {
            if(head == null)
            {
                System.out.println("List is empty!!");
                return;
            }

            if(head.next == null)   // if there is only one node
            {
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            head.prev = null;
            size--;
        }

        void deleteAtIndex(int index)
        {
            if(index == 0)
            {
                deleteAtHead();
                return;
            }

            if(index == size)
            {
                deleteAtTail();
                return;
            }

            Node temp = head;
            for(int i=1 ; i<index ; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev = temp;
            size--;
        }

        void deleteAtTail()
        {
            if(tail == null)
            {
                System.out.println("List is empty!!");
                return;
            }
            if(head.next == null)
            {
                head = null;
                tail = null;
                size--;
                return;
            }

            tail = tail.prev;
            tail.next = null;
            size--;
        }
    }

    public static void main(String[] args) {
        DLinkedList l = new DLinkedList();
        l.insertAtHead(12);
        l.insertAtHead(11);
        l.insertAtEnd(30);
        l.insertAtEnd(35);
        l.insertAtIndex(100, 4);
        l.traverse();
        l.deleteAtHead();
        l.traverse();
        l.deleteAtTail();
        l.traverse();
        l.deleteAtIndex(1);
        l.traverse();
        l.deleteAtHead();
        l.traverse();
        l.deleteAtHead();
        l.traverse();
        System.out.println(l.size);
        l.deleteAtHead();
        l.deleteAtTail();
    }
}
