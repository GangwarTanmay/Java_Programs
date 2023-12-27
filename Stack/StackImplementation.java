package Stack;

public class StackImplementation {

    public static class stack{

        int [] st;
        int currIndex = 0;  //current index at which element will be inserted i.e., point to next empty index
        stack()
        {
            st = new int[5];    // default stack will have the size of 5 elements;
        }

        stack(int length)   // this constructor will be called if user wants to give some length to stack
        {
            st = new int[length];
        }

        int peek()
        {
            if(currIndex <= 0)
            {
                System.out.println("Stack empty!");
                return -1;
            }
            return st[currIndex-1];
        }

        int size()
        {
            return currIndex;
        }

        void push(int element)
        {
            if(currIndex >= st.length)
            {
                System.out.println("Stack Overflow!!");
                return;
            }
            st[currIndex] = element;
            currIndex++;
        }

        int pop()
        {
            if(currIndex<=0)
            {
                System.out.println("Stack Underflow!!");
                return -1;
            }

            int x = st[currIndex - 1];
            st[currIndex-1] = 0;
            currIndex--;
            return x;
        }

        void display()
        {
            System.out.print("[ ");
            for(int i=0 ; i<currIndex ; i++)
            {
                System.out.print(st[i]+" ");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(3);
        st.push(4);
        st.push(8);
        st.push(11);
        st.push(17);
        st.display();
        System.out.println("Size : "+st.size());
        System.out.println("Peek : "+st.peek());
    }
}
