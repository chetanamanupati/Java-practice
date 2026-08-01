import java.util.Queue;
import java.util.LinkedList;

public class QueuePollEmptyDemo {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.poll());

    }
}
