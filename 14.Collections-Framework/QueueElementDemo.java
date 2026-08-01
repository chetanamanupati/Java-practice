import java.util.LinkedList;
import java.util.Queue;

public class QueueElementDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("SQL");
        queue.add("DBMS");

        System.out.println("Front Element: " + queue.element());

        System.out.println("Queue: " + queue);

    }
}
