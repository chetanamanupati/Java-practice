import java.util.PriorityQueue;

public class PriorityQueuePeekDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);

        System.out.println("Peek: " + pq.peek());

        System.out.println("Queue: " + pq);
    }
}
