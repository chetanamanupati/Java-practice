import java.util.PriorityQueue;

public class PriorityQueueRemoveDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Before Remove: " + pq);

        System.out.println("Removed: " + pq.remove());

        System.out.println("After Remove: " + pq);
    }
}
