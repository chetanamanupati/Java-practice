import java.util.PriorityQueue;

public class PriorityQueueElementDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(10);
        pq.offer(30);
        pq.offer(20);

        System.out.println("Element: " + pq.element());

        System.out.println("Queue: " + pq);
    }
}
