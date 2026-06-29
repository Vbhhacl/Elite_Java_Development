import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> que = new LinkedList<>();

        que.offer("Apple");
        que.offer("Banana");
        que.offer("Cherry");

        System.out.println(que.peek());

        while (!que.isEmpty()) {
            System.out.println(que.poll());
        }

        // Implementation of Deque in this Example
        Deque<String> deque = new ArrayDeque<>();

        deque.addFirst("Apple");
        deque.addLast("Banana");
        deque.addLast("Cherry");

        System.out.println("\nDeque: " + deque);

        System.out.println("Removed from Front: " + deque.pollFirst());

        System.out.println("After pollFirst(): " + deque);

        deque.addFirst("Orange");
        System.out.println("After addFirst(): " + deque);

        System.out.println("Deque:" + deque);
    }
}