import java.util.Queue;
import java.util.LinkedList;

public class QueuePollDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("SQL");
        queue.add("DBMS");

        System.out.println("Before Poll: " + queue);

        System.out.println("Removed: " + queue.poll());

        System.out.println("After Poll: " + queue);

    }
}
