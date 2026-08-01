import java.util.Queue;
import java.util.LinkedList;

public class QueueOfferDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Java");
        queue.offer("SQL");
        queue.offer("DBMS");

        System.out.println(queue);
    }
}
