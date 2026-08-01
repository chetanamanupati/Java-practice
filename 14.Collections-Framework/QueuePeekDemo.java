import java.util.Queue;
import java.util.LinkedList;

public class QueuePeekDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("SQL");
        queue.add("DBMS");

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Queue: " + queue);

    }
    
}
