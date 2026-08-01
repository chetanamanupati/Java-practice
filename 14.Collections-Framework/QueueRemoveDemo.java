import java.util.Queue;
import java.util.LinkedList;

public class QueueRemoveDemo {
     public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("SQL");
        queue.add("DBMS");
        queue.add("Spring Boot");

        System.out.println("Before Remove: " + queue);

        queue.remove();

        System.out.println("After Remove: " + queue);

        System.out.println(queue.remove());
    }
}
