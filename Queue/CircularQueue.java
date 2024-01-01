package Queue;

public class CircularQueue {
    public static class Cqueue{
        private int [] a;
        private int front = -1, rear = -1, size = 0;
        private int arrayLength;

        Cqueue()
        {
            a = new int[5];     // default circular queue of length 5
            arrayLength = 5;
        }

        Cqueue(int length)
        {
            a = new int[length];
            arrayLength = length;
        }

        void add(int x)
        {
            if((rear+1)%arrayLength == front)
            {
                System.out.println("Queue is full!!");
                return;
            }

            else {

                if(rear == -1)
                {
                    rear = 0;
                    front = 0;
                    a[rear] = x;
                    size++;
                }
                else {
                    rear = (rear + 1) % arrayLength;
                    a[rear] = x;
                    size++;
                }
            }
        }

        int remove(){
            if(front == -1)
            {
                System.out.println("Queue is empty!!");
                return 0;
            }

            if(front == rear)       // if there is only one element
            {
                int x = a[front];
                front = -1;
                rear = -1;
                size--;
                return x;
            }
            else {
                    int x = a[front];
                    front = (front+1)%arrayLength;
                    size--;
                    return x;
            }
        }

        void traverse(){
                System.out.print("[");
                for(int i=front ; i!=rear ; i=(i+1)%arrayLength)
                {
                    System.out.print(a[i]+" ");
                }
                System.out.print(a[rear]);
                System.out.print("]");
                System.out.println();
        }

        int peek()
        {
            return a[front];
        }

        int getSize()
        {
            return size;
        }
    }

    public static void main(String[] args) {
        Cqueue q = new Cqueue();
        q.traverse();
        q.add(10);
        q.traverse();
        q.add(20);
        q.traverse();
        q.add(30);
        q.traverse();
        q.add(40);
        q.traverse();
        q.add(50);
        q.traverse();


//        q.remove();
//        q.traverse();
//        q.remove();
//        q.traverse();
//        q.remove();
//        q.traverse();
//
//        q.add(99);
//        q.traverse();
    }
}
