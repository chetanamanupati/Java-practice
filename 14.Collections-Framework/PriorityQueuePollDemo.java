import java.util.PriorityQueue;

public class PriorityQueuePollDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(50);
        pq.offer(10);
        pq.offer(40);
        pq.offer(20);

        System.out.println("Before Poll: " + pq);

        System.out.println("Removed: " + pq.poll());

        System.out.println("After Poll: " + pq);

    }
}
