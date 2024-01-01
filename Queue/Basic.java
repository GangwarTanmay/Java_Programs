package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        System.out.println(q);
        q.remove();     // remove element from front
        System.out.println(q);
        q.poll();       // also remove element from front, similar to remove();
        System.out.println(q);

        System.out.println(q.element());    // return element from front
        System.out.println(q.peek());   // also return element from front, similar to peek()
    }
}
