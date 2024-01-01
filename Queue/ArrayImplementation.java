package Queue;

public class ArrayImplementation {

    public static class queue{
        int [] a;
        int front = -1, rear = -1;
        int size = 0;

        queue()     // constructor to initialize default queue of size 10
        {
            a = new int[10];
        }

        queue(int length)   // constructor to initialize queue of given size
        {
            a = new int[length];
        }

        int peek()  // return front element
        {
            if(front == -1) return -1;
            return a[front];
        }

        void add(int x)     // add x element in queue
        {
            if(rear == a.length-1)
            {
                System.out.println("Queue full!!");
                return;
            }

            if(rear == -1)
            {
                rear++;
                a[rear] = x;
                front = rear;   //both front and rear will point to same element is there is only one element
                size++;
                return;
            }
            rear = rear+1;
            a[rear] = x;
            size++;
        }

        int poll()
        {
            if(front>rear)
            {
                System.out.println("Queue Empty!!");
                return -1;
            }
            else {
                int x = peek();
                // shifts elements
                for(int i=0 ; i<rear ; i++)
                {
                    a[i] = a[i+1];
                }
                rear--;
                size--;
                return x;
            }
        }

        void traverse()
        {
            System.out.print("[");
            for(int i=front ; i<=rear ; i++)
            {
                System.out.print(a[i]+" ");
            }
            System.out.print("]");
            System.out.println();
        }

        int getSize()
        {
            return size;
        }
    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.traverse();
        System.out.println(q.peek());
        System.out.println(q.getSize());
    }
}
