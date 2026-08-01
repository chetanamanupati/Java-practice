import java.util.PriorityQueue;

public class PriorityQueueIsEmptyDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        System.out.println(pq.isEmpty());

        pq.offer(10);

        System.out.println(pq.isEmpty());
    }
}
