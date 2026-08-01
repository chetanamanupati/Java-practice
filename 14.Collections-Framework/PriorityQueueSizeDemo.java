import java.util.PriorityQueue;

public class PriorityQueueSizeDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(10);
        pq.offer(20);
        pq.offer(30);

        System.out.println(pq.size());
    }
}