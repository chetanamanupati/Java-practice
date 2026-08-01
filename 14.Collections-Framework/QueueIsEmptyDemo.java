import java.util.Queue;
import java.util.LinkedList;

public class QueueIsEmptyDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty());

        queue.add("Java");
        queue.add("SQL");

        System.out.println(queue.isEmpty());

    }
}
